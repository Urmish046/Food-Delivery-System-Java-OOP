package com.urmish.foodDeliverySystem.repository;

import com.urmish.foodDeliverySystem.domain.*;

public class RestaurantFactoryForKFC {

    public KFC createKfcRestaurant(String city){

        Category burgerCategory = createKfcBurgersCategory();
        Category drinksCategory = createKfcDrinksCategory();

        Category[] kfcMenuCategories = new Category[]{burgerCategory, drinksCategory};

        Menu menu = new Menu(kfcMenuCategories);

        KFC kfc = new KFC("KFC",city,menu);

        return kfc;
    }

    private static Category createKfcBurgersCategory(){
        return new Category("Burger",createKfcBurgers());
    }

    private static Category createKfcDrinksCategory(){
        return new Category("Drinks",createKfcDrinks());
    }


    private static  MenuItem[] createKfcDrinks(){

        MenuItem pepsi = new Drink("pepsi","Its sooo good.",250);
        MenuItem pakCola = new Drink("pakCola","Quench your thirst with the classic taste of pak cola",280);
        MenuItem[] drinks = {pepsi, pakCola};

        return drinks;
    }

    private static MenuItem[] createKfcBurgers(){

        MenuItem zinger = new Burger("zinger burger","delicious, must try!",550);
        MenuItem twister = new Burger("Twister","Amazing taste!",650);
        MenuItem kenTucky = new MenuItem("kentucky","sooooooo yummyyyy",480);

        MenuItem[] burgers = {zinger,twister,kenTucky};

        return burgers;
    }
}
