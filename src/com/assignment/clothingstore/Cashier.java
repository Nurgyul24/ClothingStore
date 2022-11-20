package com.assignment.clothingstore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cashier {

    private Cart cart;

    private LocalDateTime dateAndTime;

    public Cashier(Cart cart) {
        this.cart = cart;
    }

    public void printReceipt(Cart cart, LocalDateTime dateTime) {
        System.out.println(dateTime);
        System.out.println("---Products---");
        if (cart != null) {
            List<Shirt> shirtInCart = new ArrayList<>();
            shirtInCart = cart.getShirts();
            for (Shirt item : shirtInCart) {
                System.out.println(item.getName() + "-" + item.brand + "\n" + item.getPrice());
                System.out.printf("#discount %d - %.2f", 20, item.getPrice());
            }
        } else {
            throw new IllegalArgumentException("The cart is null!");
        }
    }
}
