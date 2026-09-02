package com.urmish.foodDeliverySystem.domain;

import java.util.Arrays;

public class Category {

    private String name;
    MenuItem[] menuItems;

    public Category(String name, MenuItem[] menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }


    @Override
    public String toString() {
        return  name;
    }
}
