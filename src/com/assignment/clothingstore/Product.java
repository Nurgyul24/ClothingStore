package com.assignment.clothingstore;

abstract class Product {

    protected String name;

    protected String brand;

    protected double price;

    protected String color;

    protected Product (String name, String brand, double price, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public double getPriceWith20PercentDiscount() {
        double discountPrice = this.price - (this.price * 0.20);
        return discountPrice;
    }
}
