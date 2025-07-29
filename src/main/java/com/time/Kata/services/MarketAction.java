package com.time.Kata.services;


import com.time.Kata.enums.TypeDiscountApplied;
import com.time.Kata.records.Product;

public interface MarketAction {
    void addItem(Product item, int quantity, TypeDiscountApplied typeDiscountApplied);
    void discount(Product item, int quantity, TypeDiscountApplied typeDiscountApplied);

}
