package com.myparking.model;

import java.time.LocalDateTime;
import java.util.Random;

public class Ticket {
    private Integer ticketNumber;
    private LocalDateTime dataTime;
    private Car car;
    private Slot slot;
    private static Random random=new Random();
    public Ticket(Car car, Slot slot) {
        this.ticketNumber =random.nextInt();
        this.dataTime = LocalDateTime.now();
        this.car = car;
        this.slot=slot;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }
}
