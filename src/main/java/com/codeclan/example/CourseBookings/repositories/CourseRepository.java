package com.codeclan.example.CourseBookings.repositories;

import com.codeclan.example.CourseBookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAllCoursesByRating(String rating);
    List<Course> findAllCoursesByCustomer(String customer);
}
