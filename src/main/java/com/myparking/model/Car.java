package com.myparking.model;

import com.myparking.enums.Color;

public class Car extends Vehicle {
    private String registrationNumber;
    private Color color;
    private String model;

    public Car(String registrationNumber, Color color, String model) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
