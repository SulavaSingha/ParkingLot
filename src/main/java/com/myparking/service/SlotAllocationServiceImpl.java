package com.myparking.service;

import com.myparking.model.Slot;

import java.util.PriorityQueue;

public class SlotAllocationServiceImpl implements SlotAllocationService {
    private PriorityQueue<Slot> availableSlotQueue;

    public SlotAllocationServiceImpl(PriorityQueue<Slot> availableSlotQueue) {
        this.availableSlotQueue = availableSlotQueue;
    }

    @Override
    /**
     * checks if slot is available
     * returns boolean
     */
    public boolean isSlotAvailable() {
        return !availableSlotQueue.isEmpty();
    }

    @Override
    /**
     * book nearest slot (with least distance from entry point)
     * returns Slot
     */
    public Slot bookSlot() {
        Slot slot=availableSlotQueue.poll();
        return slot;
    }

    /**
     * releases the slot
     * @param slot
     * @return boolean
     */
    @Override
    public boolean releaseSlot(Slot slot) {
       return availableSlotQueue.add(slot);
    }
}
