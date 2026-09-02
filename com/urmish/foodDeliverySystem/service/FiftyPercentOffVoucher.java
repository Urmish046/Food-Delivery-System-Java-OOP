package com.urmish.foodDeliverySystem.service;

import com.urmish.foodDeliverySystem.repository.Cart;

public class FiftyPercentOffVoucher extends Voucher {

    public FiftyPercentOffVoucher(String name) {
        super(name);
    }

    @Override
    public boolean isValid(Cart cart) {
        double total = cart.getCartTotal();
        return total>= 1000;
    }

    @Override
    public double discount(Cart cart) {
        return cart.getCartTotal()*0.5;
    }
}
