package com.urmish.foodDeliverySystem.repository;

import com.urmish.foodDeliverySystem.domain.Restaurant;

public class RestaurantFactory {

    static RestaurantFactoryForKFC kfc = new RestaurantFactoryForKFC();
    static RestaurantFactoryForMonal monal = new RestaurantFactoryForMonal();

    public static Restaurant getRetaurant(String name) {
        if (name.equalsIgnoreCase("kfc")) {
            return kfc.createKfcRestaurant("Kamra");
        } else if (name.equalsIgnoreCase("monal")) {
            return monal.createMonalRestaurant("Islamabad");
        } else {
            throw new IllegalArgumentException("Restaurant not found: " + name);
        }
    }
}
