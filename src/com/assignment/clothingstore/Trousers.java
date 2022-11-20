package com.assignment.clothingstore;

public class Trousers extends Product {

    private int size;

    public Trousers (String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        setSize(size);
    }

    public void setSize(int size) {
        if(size >= 42 && size <= 66) {
            if(size % 2 == 0) {
                this.size = size;
            }
        } else {
            throw new IllegalArgumentException("The size should be between 42 and 66!");
        }
    }

    public String toString(){
        return "\nTrousers:" + "\nName: " + this.name + "\nBrand: " + this.brand + "\nPrice: " + this.price
                + "\nSize: " + this.size + "\nColor: " + this.color;
    }
}
