package com.urmish.foodDeliverySystem.service;

import com.urmish.foodDeliverySystem.repository.Cart;

public class FixedPriceVoucher extends Voucher {

    public FixedPriceVoucher(String code) {
        super(code);
    }

    @Override
    public boolean isValid(Cart cart) {
        double total = cart.getCartTotal();
        return total >=1000;
    }

    @Override
    public double discount(Cart cart) {

        return 300;

    }
}
