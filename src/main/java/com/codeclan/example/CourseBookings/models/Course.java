package com.codeclan.example.CourseBookings.models;

import javax.persistence.*;
import java.awt.print.Book;

@Entity
@Table(name = "Courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Course Name")
    private String courseName;

    @Column(name = "Town")
    private String town;

    @Column(name = "Rating")
    private String rating;

    @OneToMany
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking bookings;

    public Course(String courseName, String town, String rating) {
        this.courseName = courseName;
        this.town = town;
        this.rating = rating;
    }

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
