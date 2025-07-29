package com.time.Kata.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TypeDiscountApplied {
    DISCOUNT_ON_RICE("10% discount on rice"),
    DISCOUNT_ON_APPLES("20% discount on apples");

    private final String description;

}
