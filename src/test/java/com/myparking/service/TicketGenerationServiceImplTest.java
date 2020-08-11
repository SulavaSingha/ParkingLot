package com.myparking.service;

import com.myparking.enums.Color;
import com.myparking.exception.SlotNotAvailableException;
import com.myparking.model.Car;
import com.myparking.model.Ticket;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/*
    Unit tests are written with testing frameworks like Junit, Mockito etc
    But in the interest of time and in order to keep project build simple,
    I have created objects explicitly and have not used industry approved
    syntaxes
 */
public class TicketGenerationServiceImplTest {
    private TicketGenerationService ticketGenerationService;
    Logger logger= LoggerFactory.getLogger(TicketGenerationServiceImplTest.class);

    //Test1
    public boolean createValidTicketTest(){

        Car car = new Car("KA01AB1234", Color.BLACK, "HONDA");

        //ticketGenerationService = new TicketGenerationServiceImpl(createNiceMock(SlotAllocationService))

        try {
            Ticket ticket=ticketGenerationService.createTicket(car);
            return ticket.getTicketNumber()!=null;
        } catch (SlotNotAvailableException e) {
            logger.error(e.getMessage());
        }
        return false;
    }
}
