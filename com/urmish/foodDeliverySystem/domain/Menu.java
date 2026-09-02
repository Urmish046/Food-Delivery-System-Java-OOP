package com.urmish.foodDeliverySystem.domain;

import java.util.Arrays;

public class Menu {

    Category[] categories;

    public Menu(Category[] categories) {
        this.categories = categories;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "categories=" + Arrays.toString(categories) +
                '}';
    }

    public void displayCategories(){
        System.out.println("       Categories");
        System.out.println("=========================");
        for (Category category: categories){
            System.out.println("\n"+category.getName());
            System.out.println("---------------------");
            for (MenuItem foodItem: category.getMenuItems()){
                System.out.println(foodItem.getName()+"      Rs. "+foodItem.getPrice());
            }
        }
    }
}
