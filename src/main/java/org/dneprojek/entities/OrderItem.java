package org.dneprojek.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class OrderItem {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "good_id")
    private Good good;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private LocalDate date;
    private int amount;

    public OrderItem() {
    }

    public OrderItem(LocalDate date, Customer customer, Good good, int amount) {
        this.date = date;
        this.customer = customer;
        this.good = good;
        this.amount = amount;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

