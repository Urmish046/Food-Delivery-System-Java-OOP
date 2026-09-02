package com.urmish.foodDeliverySystem.domain;

public class DeliveryBoy {

    private String name;
    private int id;
    private int phoneNumber;
     double speed;

    public DeliveryBoy(String name, int id, int phoneNumber, double speed) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
