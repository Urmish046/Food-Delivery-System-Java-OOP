package com.urmish.foodDeliverySystem.repository;

import com.urmish.foodDeliverySystem.domain.Address;
import com.urmish.foodDeliverySystem.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    static List<Customer> customerDatabase = new ArrayList<>();

    static {
        var urmishAddress = new Address("Kamra", "Kutba", 1, 123);
        var urmish = new Customer("Urmish", "urmish", "123", 123, urmishAddress);

        var harisAddress = new Address("Attock", "Mehria", 1, 12345);
        var harris = new Customer("Haris", "haris", "12356", 12345, harisAddress);

        customerDatabase.add(urmish);
        customerDatabase.add(harris);
    }

    public void addCustomer(Customer customer) {
        customerDatabase.add(customer);
    }


    public Customer exists(String username, String password) {
        for (var customer : customerDatabase) {
            if (customer.getUsername().equalsIgnoreCase(username) &&
                    customer.getPassword().equalsIgnoreCase(password)) {
                return customer;
            }
        }

        return null;
    }
}
