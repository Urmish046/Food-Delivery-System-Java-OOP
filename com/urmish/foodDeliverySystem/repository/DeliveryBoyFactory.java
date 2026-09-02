package com.urmish.foodDeliverySystem.repository;

import com.urmish.foodDeliverySystem.domain.DeliveryBoy;

public class DeliveryBoyFactory {

    public static DeliveryBoy[] getAllDeliveryBoys(){
        return new DeliveryBoy[]{
                new DeliveryBoy("Jack",110,2345,20),
                new DeliveryBoy("John",111,2546,50),
                new DeliveryBoy("James",112,6575,120)
        };

    }



}
