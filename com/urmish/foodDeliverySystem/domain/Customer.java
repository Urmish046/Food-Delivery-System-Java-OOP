package com.urmish.foodDeliverySystem.domain;

import java.util.Scanner;

public class Customer extends Person {
    private static final Scanner scanner = new Scanner(System.in);

    private String username;
    private String password;
    private long phoneNumber;
    Address customerAddress;

    public Customer(String name, String username, String password, long phoneNumber, Address address) {
        super(name);
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.customerAddress = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }


    public Address getCustomerAddress() {
        return customerAddress;
    }


    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Address inputAddress() {
        System.out.println("City: ");
        var city = scanner.nextLine();
        System.out.println("Area: ");
        var area = scanner.nextLine();
        System.out.println("Street number: ");
        var streetNumber = scanner.nextInt();
        System.out.println("House Number: ");
        var houseNumber = scanner.nextInt();

        Address myAddress = new Address(city, area, streetNumber, houseNumber);
        return myAddress;
    }

    public double calculateTime(DeliveryBoy deliveryBoy) {

        System.out.println("Enter the exact distance in kilometers: ");
        double distance = scanner.nextDouble();
        double time = 0;
        time = distance / deliveryBoy.speed;
        return time;
    }


    @Override
    public String toString() {
        return
                " customerAddress= " + customerAddress;

    }
}

