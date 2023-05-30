package com.example.tdd_java.sprout;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void displayCart() {
        CartItemInfo cartItemInfo = new CartItemInfo(this);
        System.out.println(cartItemInfo.displayItemInfo());
    }
}
