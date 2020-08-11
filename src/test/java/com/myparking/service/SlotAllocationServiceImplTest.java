package com.myparking.service;

import com.myparking.enums.SlotStatus;
import com.myparking.model.Slot;

import java.util.PriorityQueue;

/*
    Unit tests are written with testing frameworks like Junit, Mockito etc
    But in the interest of time and in order to keep project build simple,
    I have created objects explicitly and have not used industry approved
    syntaxes
 */
public class SlotAllocationServiceImplTest {
    private SlotAllocationService slotAllocationService;

    public boolean bookSlotTest(){
        PriorityQueue<Slot> slots = new PriorityQueue<>();
        slots.add(new Slot("s1", 1, SlotStatus.EMPTY));
        slotAllocationService = new SlotAllocationServiceImpl(slots);
        Slot slot=slotAllocationService.bookSlot();
        return slot!=null;
    }

    public boolean slotAvailableTest(){
        PriorityQueue<Slot> slots = new PriorityQueue<>();
        slots.add(new Slot("s1", 1, SlotStatus.EMPTY));
        slotAllocationService = new SlotAllocationServiceImpl(slots);
        return slotAllocationService.isSlotAvailable();
    }

    public boolean slotNotAvailableTest(){
        PriorityQueue<Slot> slots = new PriorityQueue<>();
        slotAllocationService = new SlotAllocationServiceImpl(slots);
        return !slotAllocationService.isSlotAvailable();
    }

    public boolean releaseSlotTest(){
        PriorityQueue<Slot> slots = new PriorityQueue<>();
        slots.add(new Slot("s1", 1, SlotStatus.EMPTY));
        slotAllocationService = new SlotAllocationServiceImpl(slots);
        Slot slot=slotAllocationService.bookSlot();
        return slotAllocationService.releaseSlot(slot);
    }
}
