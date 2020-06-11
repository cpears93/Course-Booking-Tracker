package com.codeclan.example.CourseBookings.models;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Customer Name")
    private String name;

    @Column(name = "Town")
    private String town;

    @Column(name = "Age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    public Customer(String name, String town, int age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
