package com.MyFirstApp.Student.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;

    @Transient
    private int age;
    private String email;
    private String name;

    private LocalDate dateOfBirth;

    public Student() {
    }

    public Student(String email, String name, LocalDate dateOfBirth) {
        this.email = email;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(Long id, String email, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getDays();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student {id= "+ getId()+ "\n age= "
                + getAge() + "\n name= " + getName() +
                "\n email= " + getEmail() + "\n Date of Birth= " +
                getDateOfBirth() + "}";
    }
}
