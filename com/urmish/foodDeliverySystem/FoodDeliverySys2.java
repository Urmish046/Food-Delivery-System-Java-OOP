package com.urmish.foodDeliverySystem;

import com.urmish.foodDeliverySystem.domain.*;
import com.urmish.foodDeliverySystem.repository.*;

import java.util.Scanner;

import static com.urmish.foodDeliverySystem.domain.Customer.inputAddress;

public class FoodDeliverySys2 {

    private static final Scanner scanner = new Scanner(System.in);
    static Cart cart = new Cart();
    static DeliveryBoy[] deliveryBoy = DeliveryBoyFactory.getAllDeliveryBoys();
    static CustomerRepository customerRepository = new CustomerRepository();

    public static void main(String[] args) {

        System.out.println("\nWelcome to Food Delivery System");
        System.out.println("====================================");

        System.out.println("Enter your Identity - Customer/Admin");
        var identity = scanner.nextLine();

        if (identity.equalsIgnoreCase("Admin")) {
            System.out.println(":: System Details ::");
            System.out.println("--List of restaurants:        1.KFC    2.Monal");
            System.out.println("--List of Delivery Boys: ");
            for (DeliveryBoy db : deliveryBoy) {
                System.out.println("Name:" + db.getName() + "\nPhoneNumber:" + db.getPhoneNumber() + "\nID" + db.getId());
                System.out.println();
            }
        } else if (identity.equalsIgnoreCase("customer")) {
            System.out.println("Enter your username: ");
            var username = scanner.nextLine();

            System.out.println("Enter your password ");
            var password = scanner.nextLine();

            var customer = customerRepository.exists(username, password);

            if (customer != null) {
                System.out.println("Welcome " + username + "!");
            } else {
                customer = signUp();
            }

            System.out.println("Enter you desired Restaurant:");
            var rest = scanner.nextLine();
            var restaurant = RestaurantFactory.getRetaurant(rest);

            Menu menu = restaurant.getMenu();
            menu.displayCategories();

            System.out.println();
            System.out.println("Choose your category:");
            var cat = scanner.nextLine();
            var category = restaurant.getCategoryItemByName(cat);

            System.out.println("Choose your item from the above categories:");
            var item = scanner.nextLine();
            var myItem = restaurant.getMenuItemByName(category, item);

            System.out.println("Enter the quantity for your items:");
            var quantity = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < quantity; i++) {
                cart.addToCart(myItem);
            }

            System.out.println("Do you want to apply voucher - yes/no?");
            var ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("Enter the code: ");
                var code = scanner.nextLine();
                cart.applyVoucher(code);
            }

            scanner.nextLine();

            System.out.println("\n:: Order Details ::");
            System.out.println("---------------------------");
            System.out.println("Name: " + customer.getName() + "  \nPhone Number: " + customer.getPhoneNumber());
            System.out.println("Your Order is: \n" + quantity + " " + myItem + "of " + category + "category.");
            System.out.println("Total: " + cart.getCartTotal() + ".");
            System.out.println("(Your order will be delivered to customerAddress: " + customer.getCustomerAddress());
            DeliveryBoy deliveryBoy1 = deliveryBoy[(int) Math.random() * 3];
            System.out.println("Delivery Boy: " + deliveryBoy1.getName() + " (ID-" + deliveryBoy1.getId() + ")" + " Phone Number: " + deliveryBoy1.getPhoneNumber());
            System.out.println("Approximate time: " + customer.calculateTime(deliveryBoy1) + " Hours.");
        }
    }

    private static Customer signUp() {
        System.out.println("You are not registered yet. Please register first.");
        System.out.println("Enter your name: ");
        var name = scanner.nextLine();

        System.out.println("Enter your username: ");
        var username = scanner.nextLine();

        System.out.println("Enter your password: ");
        var password = scanner.nextLine();

        System.out.println("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();

        var newCustomer = new Customer(name, username, password, phoneNumber, inputAddress());

        customerRepository.addCustomer(newCustomer);

        return newCustomer;
    }
}

