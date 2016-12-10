package org.dneprojek.services;


import org.dneprojek.entities.Good;
import org.dneprojek.entities.OrderItem;
import org.dneprojek.entities.Customer;
import org.dneprojek.enums.Categories;
import org.dneprojek.enums.Gender;
import org.dneprojek.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Arrays;

@Service
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public void save() {
        Customer[] customer = new Customer[100];
        Good[] shoes = new Good[1000];
        OrderItem[] buy = new OrderItem[100000];

        customer[1] = new Customer("Lina", Gender.FEMALE, "066-56", "dfw@df.com");
        customer[2] = new Customer("Anna", Gender.FEMALE, "067-57", "dfw@df.com");
        customer[3] = new Customer("Andre", Gender.MALE, "066-556", "dfw@df.com");
        customer[4] = new Customer("Sergey", Gender.MALE, "067-577", "dfw@df.com");

        customerRepo.save(Arrays.asList(customer));

        shoes[1] = new Good("summer", Categories.FORMAN, 43, 950.46);
        shoes[2] = new Good("summer", Categories.FORWOMEN, 32, 1050.12);
        shoes[3] = new Good("summer", Categories.FORCHILDREN, 28, 560.20);


//        buy[1] = new OrderItem(LocalDate.now(), customer[1], shoes[1], 2);
//        buy[2] = new OrderItem(LocalDate.MIN, customer[2], shoes[2], 1);
//        buy[3] = new OrderItem(LocalDate.MAX, customer[3], shoes[2], 2);
    }
}

