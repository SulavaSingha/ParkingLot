package com.myparking.service;

import com.myparking.exception.SlotNotAvailableException;
import com.myparking.model.Car;
import com.myparking.model.Slot;
import com.myparking.model.Ticket;
import com.myparking.model.Vehicle;

public class TicketGenerationServiceImpl implements TicketGenerationService {

    private SlotAllocationService slotAllocationService;

    public TicketGenerationServiceImpl(SlotAllocationService slotAllocationService) {
        this.slotAllocationService = slotAllocationService;
    }

    /**
     * creates ticket for provided car
     * @param car
     * @return Ticket
     * @throws SlotNotAvailableException
     */
    @Override
    public Ticket createTicket(Car car) throws SlotNotAvailableException{
        if(slotAllocationService.isSlotAvailable()){
        Slot slot= slotAllocationService.bookSlot();
        Ticket ticket= new Ticket(car,slot);
        return ticket;
        }
        else {
            throw new SlotNotAvailableException("Parking Is Full");
        }
    }

    /**
     * should expiry ticket. Implementation incomplete because of lock of time
     * @return
     */
    @Override
    public boolean expireTicket() {
        return false;
    }
}
