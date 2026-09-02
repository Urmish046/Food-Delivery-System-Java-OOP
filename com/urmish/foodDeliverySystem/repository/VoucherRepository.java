package com.urmish.foodDeliverySystem.repository;

import com.urmish.foodDeliverySystem.service.FiftyPercentOffVoucher;
import com.urmish.foodDeliverySystem.service.FixedPriceVoucher;
import com.urmish.foodDeliverySystem.service.Voucher;

public class VoucherRepository {

    public static Voucher[] getAllVouchers(){
        return new Voucher[]{
                new FiftyPercentOffVoucher("50per"),
                new FixedPriceVoucher("500"),
        };
    }

    public static Voucher getVoucherCode(String code){
        for (Voucher voucher : getAllVouchers()){
            if (voucher.getCode().equals(code)){
                return voucher;
            }
        }
        return null;
    }
}
