package org.dneprojek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoesShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoesShopApplication.class, args);

        ShopUI ui = new ShopUI();

        Customers[] customer = new Customers[100];
        Shoes[] shoes = new Shoes[1000];
        BuyInfo[] buy = new BuyInfo[100000];

        customer[1] = new Customers("Lina", Gender.FEMALE, "066-56");
        customer[2] = new Customers("Anna", Gender.FEMALE, "067-57");
        customer[3] = new Customers("Andre", Gender.MALE, "066-556");
        customer[4] = new Customers("Sergey", Gender.MALE, "067-577");

        shoes[1] = new Shoes("summer", Categories.FORMAN, 43, 950.46);
        shoes[2] = new Shoes("summer", Categories.FORWOMEN, 32, 1050.12);
        shoes[3] = new Shoes("summer", Categories.FORCHILDREN, 28, 560.20);


        buy[1] = new BuyInfo(10116, customer[1], shoes[1], 2);
        buy[2] = new BuyInfo(10117, customer[2], shoes[2], 1);
        buy[3] = new BuyInfo(10118, customer[3], shoes[2], 2);

        System.out.println(Service.totalNumberShoes());
    }
}

