package com.time.Kata;

import com.time.Kata.enums.TypeDiscountApplied;
import com.time.Kata.records.Car;
import com.time.Kata.records.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SupermarketReceiptTest {
    @Test
    public void supermarketReceiptTest(){
        Car car = new Car();
        Product rices = new Product("Rice",2.49);
        Product apples = new Product("Apples",1.99);
        car.addItem(rices,2, TypeDiscountApplied.DISCOUNT_ON_RICE);
        car.addItem(apples,2, TypeDiscountApplied.DISCOUNT_ON_APPLES);
        assertEquals((2.49 * 0.9 * 2)+(1.99 * 0.8 * 2),car.getTotalPrice(),0.001);
    }
}
