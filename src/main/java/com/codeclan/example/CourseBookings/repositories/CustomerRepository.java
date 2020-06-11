package com.codeclan.example.CourseBookings.repositories;

import com.codeclan.example.CourseBookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAllCustomersByCourse(String course);
}
