package com.urmish.foodDeliverySystem.domain;

public class Admin extends Person {

    private int age;
    DeliveryBoy[] deliveryBoy;

    public Admin(String name, int age, DeliveryBoy[] deliveryBoy) {
        super(name);
        this.age = age;
        this.deliveryBoy = deliveryBoy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DeliveryBoy[] getDeliveryBoy() {
        return deliveryBoy;
    }

    public void setDeliveryBoy(DeliveryBoy[] deliveryBoy) {
        this.deliveryBoy = deliveryBoy;
    }
}
