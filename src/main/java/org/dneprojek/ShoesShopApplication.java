package org.dneprojek;

import org.dneprojek.entities.OrderItem;
import org.dneprojek.entities.Customer;
import org.dneprojek.entities.Good;
import org.dneprojek.enums.Categories;
import org.dneprojek.enums.Gender;
import org.dneprojek.repo.CustomerRepo;
import org.dneprojek.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.dneprojek")
@SpringBootApplication
public class ShoesShopApplication implements CommandLineRunner{
//public class ShoesShopApplication implements CommandLineRunner{

    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(ShoesShopApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
//        customerService.save();
    }
}

