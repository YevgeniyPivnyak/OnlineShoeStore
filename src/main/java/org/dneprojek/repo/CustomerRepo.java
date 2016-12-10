package org.dneprojek.repo;

import org.dneprojek.entities.Customer;
import org.dneprojek.enums.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Customer findOneByName(String name);
    List<Customer> findByGender(Gender gender);
}
