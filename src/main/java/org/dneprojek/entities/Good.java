package org.dneprojek.entities;


import org.dneprojek.enums.Categories;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Good {
    @Id
    private Long id;

    private String season;
    @Enumerated(EnumType.STRING)
    private Categories categories;
    private int size;
    private double price;

    public Good() {
    }

    public Good(String season, Categories categories, int size, double price){
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
