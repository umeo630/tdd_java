package com.example.tdd_java.sprout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartItemInfoTest {
    @Test
    public void testDisplayItemInfo() {
        Cart cart = new Cart();
        cart.addItem(new Item("商品A", 100.0));
        cart.addItem(new Item("商品B", 200.0));
        cart.addItem(new Item("商品A", 100.0));

        CartItemInfo cartInfo = new CartItemInfo(cart);
        String cartDetails = cartInfo.displayItemInfo();

        String expectedDetails = "商品名: 商品A\n個数: 2\n商品名: 商品B\n個数: 1\n合計金額: 400.0\n";

        assertEquals(expectedDetails, cartDetails);
    }
}
