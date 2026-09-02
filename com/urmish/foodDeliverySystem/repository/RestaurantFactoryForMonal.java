package com.urmish.foodDeliverySystem.repository;

import com.urmish.foodDeliverySystem.domain.*;

public class RestaurantFactoryForMonal {

    public Monal createMonalRestaurant(String city){

        Category burgerCategory = createMonalBurgersCategory();
        Category drinksCategory = createMonalDrinksCategory();

        Category[] monalMenuCategories = new Category[]{burgerCategory, drinksCategory};

        Menu menu = new Menu(monalMenuCategories);

        Monal monal = new Monal("KFC",city,menu);

        return monal;
    }

    private static Category createMonalBurgersCategory(){
        return new Category("Burger",createMonalBurgers());
    }

    private static Category createMonalDrinksCategory(){
        return new Category("Drinks",createMonalDrinks());
    }


    private static  MenuItem[] createMonalDrinks(){

        MenuItem pepsi = new Drink("pepsi","Its sooo good.",250);
        MenuItem cocaCola = new Drink("Coca Cola","Quench your thirst with the classic taste of pak cola",280);
        MenuItem[] drinks = {pepsi, cocaCola};

        return drinks;
    }

    private static MenuItem[] createMonalBurgers(){

        MenuItem CheeseBurger = new Burger("Cheese burger","delicious, must try!",550);
        MenuItem Veggie = new Burger("Veggie","Amazing taste!",650);
        MenuItem McSpicy = new MenuItem("kentucky","sooooooo yummyyyy",480);

        MenuItem[] burgers = {CheeseBurger,Veggie, McSpicy};

        return burgers;
    }
}
