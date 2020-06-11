package com.codeclan.example.CourseBookings.components;

import com.codeclan.example.CourseBookings.models.Booking;
import com.codeclan.example.CourseBookings.models.Course;
import com.codeclan.example.CourseBookings.models.Customer;
import com.codeclan.example.CourseBookings.repositories.BookingRepository;
import com.codeclan.example.CourseBookings.repositories.CourseRepository;
import com.codeclan.example.CourseBookings.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Booking booking1 = new Booking("25-07-2021");
        bookingRepository.save(booking1);

        Course course1 = new Class("Intro to Python", "Edinburgh", "4 out of 5 Stars");
        courseRepository course1.save(course1);

        Customer customer1 = new Customer("Adam Russell", "Edinburgh", 23);
        customerRepository customer1.save(customer1);
    }

}
