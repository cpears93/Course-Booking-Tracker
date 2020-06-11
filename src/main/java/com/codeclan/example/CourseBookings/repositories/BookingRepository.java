package com.codeclan.example.CourseBookings.repositories;

import com.codeclan.example.CourseBookings.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findAllBookingsByDate(Integer date);
}
