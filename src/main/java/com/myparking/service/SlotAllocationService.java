package com.myparking.service;

import com.myparking.model.Slot;

public interface SlotAllocationService {
    public boolean isSlotAvailable();
    public Slot bookSlot();
    public boolean releaseSlot(Slot slot);
}
