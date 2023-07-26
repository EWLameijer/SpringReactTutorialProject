package org.ericwubbo.springreacttutorialproject;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Item {
    private String name;

    private BigDecimal price;

    public Item(String name, String price) {
        this.name = name;
        this.price = new BigDecimal(price);
    }
}
