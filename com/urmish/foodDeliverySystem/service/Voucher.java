package com.urmish.foodDeliverySystem.service;

import com.urmish.foodDeliverySystem.repository.Cart;

public abstract class Voucher {

    String code;

    public Voucher(String name) {
        this.code = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public abstract boolean isValid(Cart cart);

    public abstract double discount(Cart cart);



}
