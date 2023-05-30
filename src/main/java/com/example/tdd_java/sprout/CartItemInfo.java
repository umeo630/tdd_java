package com.example.tdd_java.sprout;

import java.util.LinkedHashMap;
import java.util.Map;

public class CartItemInfo {
    private Cart cart;

    public CartItemInfo(Cart cart) {
        this.cart = cart;
    }

    public String displayItemInfo() {
        Map<String, Integer> itemCounts = new LinkedHashMap<>();
        double total = 0;
        StringBuilder infoBuilder = new StringBuilder();

        for (Item item : cart.getItems()) {
            itemCounts.put(item.getName(), itemCounts.getOrDefault(item.getName(), 0) + 1);
            total += item.getPrice();
        }

        for (Map.Entry<String, Integer> entry : itemCounts.entrySet()) {
            infoBuilder.append("商品名: ").append(entry.getKey()).append("\n");
            infoBuilder.append("個数: ").append(entry.getValue()).append("\n");
        }
        infoBuilder.append("合計金額: ").append(total).append("\n");

        return infoBuilder.toString();
    }
}
