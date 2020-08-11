package com.myparking.model;

import com.myparking.enums.SlotStatus;

public class Slot {
    private String SlotNumber;
    private int distance;
    private SlotStatus slotstatus;

    public Slot(String slotNumber, int distance, SlotStatus slotstatus) {
        SlotNumber = slotNumber;
        this.distance = distance;
        this.slotstatus = slotstatus;
    }

    public String getSlotNumber() {
        return SlotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        SlotNumber = slotNumber;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public SlotStatus getSlotstatus() {
        return slotstatus;
    }

    public void setSlotstatus(SlotStatus slotstatus) {
        this.slotstatus = slotstatus;
    }
}
