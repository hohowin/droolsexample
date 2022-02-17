package com.example.drools;

public class Order {

    private String name;
    private String creditCardType;
    private int discount;
    private int price;

    public String getName() {
        return name;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public int getDiscount() {
        return discount;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
