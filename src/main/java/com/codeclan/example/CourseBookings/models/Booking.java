package com.codeclan.example.CourseBookings.models;

import javax.persistence.*;

@Entity
@Table(name = "Bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private int date;

    @OneToMany
    @JoinColumn(name = "bookings_id", nullable = false)
    private Booking booking;

    public Booking(int date) {
        this.date = date;
    }

    public Booking() {
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
