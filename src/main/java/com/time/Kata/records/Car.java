package com.time.Kata.records;

import com.time.Kata.enums.TypeDiscountApplied;
import com.time.Kata.services.MarketAction;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Getter
@NoArgsConstructor
public class Car implements MarketAction {
    private final List<Product> items = new ArrayList<>();
    private double totalPrice = 0;


    @Override
    public void addItem(Product item, int quantity, TypeDiscountApplied typeDiscountApplied) {
        items.add(item);
        discount(item, quantity, typeDiscountApplied);
    }

    @Override
    public void discount(Product item, int quantity, TypeDiscountApplied typeDiscountApplied) {
        switch (typeDiscountApplied){
            case DISCOUNT_ON_RICE :
                totalPrice+= item.price() * quantity * 0.9;
                break;

            case DISCOUNT_ON_APPLES:
                totalPrice+= item.price() * quantity * 0.8;
                break;
        }
    }
}
