package com.codeclan.example.CourseBookings.controllers;

import com.codeclan.example.CourseBookings.models.Booking;
import com.codeclan.example.CourseBookings.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> findBookingsByDate(
            @RequestParam(name = "date", required = false)Integer date
    ) {
        if (date != null) {
            return new ResponseEntity<>(bookingRepository.findAllBookingsByDate(date), HttpStatus.OK);
        }
        return new ResponseEntity<>(bookingRepository.findAllBookingsByDate(date), HttpStatus.OK);
    }
}
