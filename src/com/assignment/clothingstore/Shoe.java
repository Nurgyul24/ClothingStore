package com.assignment.clothingstore;

public class Shoe extends Product {

    private int size;

    public Shoe (String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        setSize(size);
    }

    public void setSize(int size) {
        if(size >= 39 && size <= 46) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("The size should be between 39 and 46!");
        }
    }

    public String getName() {
        return this.name;
    }

    public double getPriceWith25PercentDiscount() {
        double discountPrice = this.price - (this.price * 0.25);
        return discountPrice;
    }

    public String toString(){
        return "\nShoe:" + "\nName: " + this.name + "\nBrand: " + this.brand + "\nPrice: " + this.price
                + "\nSize: " + this.size + "\nColor: " + this.color;
    }
}
