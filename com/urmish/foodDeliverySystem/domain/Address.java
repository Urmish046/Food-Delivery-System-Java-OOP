package com.urmish.foodDeliverySystem.domain;

public class Address {

   private String city;
   private String area;
   private int streetNumber;
   private int houseNumber;

    public Address(String city, String area, int streetNumber, int houseNumber) {
        this.city = city;
        this.area = area;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return   houseNumber+ ',' +streetNumber+ ','+ area + ',' + city;
    }
}
