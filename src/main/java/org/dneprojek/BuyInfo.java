package org.dneprojek;


public class BuyInfo {
    Shoes shoes;
    Customers customer;
    int date;
    int amount;

    public BuyInfo() {
    }

    public BuyInfo(int date, Customers customer, Shoes shoes, int amount) {
        this.date = date;
        this.customer = customer;
        this.shoes = shoes;
        this.amount = amount;

    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

