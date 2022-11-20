package com.assignment.clothingstore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static final double normalDiscount = 0.20;

    private static final double discountShirtOnTuesday = 0.10;

    private static final double shoesDiscountOnTuesday = 0.25;

    private List<Shirt> shirtsList = new ArrayList<>();

    private List<Shoe> shoesList = new ArrayList<>();

    private List<Jacket> jacketList = new ArrayList<>();

    private List<Trousers> trousersList = new ArrayList<>();

    private LocalDateTime dateAndTime;

    public List<Shirt> getShirts() {
        return shirtsList;
    }

    public List<Shoe> getShoesList() {
        return shoesList;
    }

    public List<Jacket> getJacketList() {
        return jacketList;
    }

    public List<Trousers> getTrousersList() {
        return trousersList;
    }

    public void addShirts(Shirt shirt) {
        if(shirt != null) {
            shirtsList.add(shirt);
        } else {
            throw new IllegalArgumentException("The product you want to add is null!");
        }
    }

    public void addShoes(Shoe shoe) {
        if(shoe != null) {
            shoesList.add(shoe);
        } else {
            throw new IllegalArgumentException("The product you want to add is null!");
        }
    }

    public void addJacket(Jacket jacket) {
        if(jacket != null) {
            jacketList.add(jacket);
        } else {
            throw new IllegalArgumentException("The product you want to add is null!");
        }
    }

    public void addTrousers(Trousers trousers) {
        if(trousers != null) {
            trousersList.add(trousers);
        } else {
            throw new IllegalArgumentException("The product you want to add is null!");
        }
    }

    public List<String> getShirtsNames() {
        List<String> list = new ArrayList<>();
        for(Shirt item : shirtsList) {
            list.add(item.getName());
        }
        return list;
    }

    public List<String> getShoesNames() {
        List<String> list = new ArrayList<>();
        for(Shoe item : shoesList) {
            list.add(item.getName());
        }
        return list;
    }

    public List<String> getJacketsNames() {
        List<String> list = new ArrayList<>();
        for(Jacket item : jacketList) {
            list.add(item.getName());
        }
        return list;
    }

    public List<String> getTrousersNames() {
        List<String> list = new ArrayList<>();
        for(Trousers item : trousersList) {
            list.add(item.getName());
        }
        return list;
    }

    public int calculateTheAmountOfAllProducts() {
        int total = 0;
        total = shirtsList.size() + shoesList.size() + jacketList.size() + trousersList.size();
        return total;
    }

    public double calculateNormalDiscountForShirts() {
        if(calculateTheAmountOfAllProducts() >= 3) {
           for (Shirt item : shirtsList) {
               item.getPriceWith20PercentDiscount();
           }
        }
        return 0.0;
    }

    public String toString(){
        return "\nProducts in the Cart: " + "\n" + getShirtsNames().toString() + "\n" + getShoesNames().toString() + "\n" +
                getJacketsNames().toString() + "\n" + getTrousersNames().toString();
    }
}
