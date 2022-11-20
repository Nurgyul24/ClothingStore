package com.assignment.clothingstore;

public class Main {
    public static void main(String[] args) {

        Shirt newShirt = new Shirt("Blue Cotton Shirt", "BrandS", 14.99, "blue", SizeOfShirt.M);
        Shoe newShoe = new Shoe("Black Suede Shoes", "BrandS", 18.99, "black", 44);

        System.out.println(newShirt.toString());

        Cart cart = new Cart();
        cart.addShirts(newShirt);
        cart.addShoes(newShoe);
        System.out.println(cart.toString());

    }
}
