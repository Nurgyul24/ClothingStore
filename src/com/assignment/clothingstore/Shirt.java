package com.assignment.clothingstore;

public class Shirt extends Product {

    private SizeOfShirt size;

    public Shirt (String name, String brand, double price, String color, SizeOfShirt size) {
        super(name, brand, price, color);
        this.size = size;
    }

    public void setSize(SizeOfShirt size) {
        this.size = size;
    }

    public SizeOfShirt getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }

    public double getPriceWith10PercentDiscount() {
        double discountPrice = this.price - (this.price * 0.10);
        return discountPrice;
    }

    public String toString(){
        return "\nShirt:" + "\nName: " + this.name + "\nBrand: " + this.brand + "\nPrice: " + this.price
                + "\nSize: " + this.size + "\nColor: " + this.color;
    }
}
