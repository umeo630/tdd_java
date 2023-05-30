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
        for(Item item : items) {
            System.out.println("商品名: " + item.getName());
            System.out.println("価格: " + item.getPrice());
        }
    }
}
