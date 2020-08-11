import com.myparking.enums.Color;
import com.myparking.enums.SlotStatus;
import com.myparking.exception.SlotNotAvailableException;
import com.myparking.model.Car;
import com.myparking.model.Slot;
import com.myparking.model.Ticket;
import com.myparking.service.SlotAllocationServiceImpl;
import com.myparking.service.TicketGenerationServiceImpl;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;


import java.util.PriorityQueue;


public class ParkingLotServer {
    /*
    In a real world system, we would use dependency injection frameworks for
    creating services, however due to lack of time, I am manually constructing them
     */
    public static void main(String[] args){
        Logger logger= LoggerFactory.getLogger(ParkingLotServer.class);

        //creating slot objects
        int noOfSlots=10;
        PriorityQueue<Slot> availableSlotsQueue = new
                PriorityQueue<Slot>((s1, s2)->s1.getDistance()-s2.getDistance());
        for(int i=0;i<noOfSlots;i++){
            Slot slot = new Slot("s" + i, i, SlotStatus.EMPTY);
            availableSlotsQueue.add(slot);
        }

        //creating services
        SlotAllocationServiceImpl slotAllocationService = new SlotAllocationServiceImpl(availableSlotsQueue);
        TicketGenerationServiceImpl ticketGenerationService = new TicketGenerationServiceImpl(slotAllocationService);

        Car car = new Car("KA01AB1234", Color.BLACK, "HONDA");
        try {
            Ticket ticket=ticketGenerationService.createTicket(car);
            System.out.print("Your Ticket Number Generated: "+ticket.getTicketNumber());
        } catch (SlotNotAvailableException e) {
            logger.error(e.getMessage());
        }

    }

}
