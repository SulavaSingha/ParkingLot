package com.myparking.service;

import com.myparking.exception.SlotNotAvailableException;
import com.myparking.model.Car;
import com.myparking.model.Ticket;

public interface TicketGenerationService {
  public Ticket createTicket(Car car) throws SlotNotAvailableException;
  public boolean expireTicket();

}

