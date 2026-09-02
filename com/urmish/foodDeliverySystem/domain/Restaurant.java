package com.urmish.foodDeliverySystem.domain;

public class Restaurant {

    String name;
    String location;
    Menu menu;

    public Restaurant(){};

    public Restaurant(String name, String location, Menu menu) {
        this.name = name;
        this.location = location;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", menu=" + menu +
                '}';
    }

    public Category getCategoryItemByName(String name){
        for (Category category: menu.categories){
            if (category.getName().equalsIgnoreCase(name)){
                return category;
            }
        }
        return null;
    }

    public MenuItem getMenuItemByName(Category category, String name){
        for (MenuItem item: category.getMenuItems()){
            if (item.getName().equalsIgnoreCase(name)){
                return item;
            }
        }
        return null;
    }


}
