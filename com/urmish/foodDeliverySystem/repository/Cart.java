package com.urmish.foodDeliverySystem.repository;

import com.urmish.foodDeliverySystem.domain.MenuItem;
import com.urmish.foodDeliverySystem.service.Voucher;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<MenuItem> menuItems = new ArrayList<>();
    double total;
    boolean isVoucherApplied = false;

    public void addToCart(MenuItem menuItem) {
        menuItems.add(menuItem);
        total = total + menuItem.getPrice();
    }

    public void subtractFromCart(MenuItem menuItem) {
        menuItems.remove(menuItem);
        total = total - menuItem.getPrice();

    }

    public double getCartTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void applyVoucher(String code) {
        Voucher voucher = VoucherRepository.getVoucherCode(code);

        if (voucher != null && !isVoucherApplied) {
            if (voucher.isValid(this)) {
                double discount = voucher.discount(this);
                total = total - discount;
                isVoucherApplied = true;
            } else {
                System.out.println("Voucher is not valid :(");
            }
        }
    }



}
