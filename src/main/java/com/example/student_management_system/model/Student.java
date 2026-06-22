package com.example.student_management_system.model;
import jakarta.persistence.*;

@Entity                     // - Tells Spring this Student Class goes to a database table
@Table(name = "students")   // - Name the table in SQL Databse
public class Student {

    @Id                     // - This Field is the Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // - ID auto increments, we don't have to set it manually
    private Long id;

    private String name;
    private String email;
    private String department;
    private int year;

    // Getter Methods
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getDepartment() {
        return department;
    }
    public int getYear() {
        return year;
    }

    // Setter Methods
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
