package com.grading.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy="student")
    @JsonBackReference
    private List<Assignment> assignments;

    @Column(name = "grade")
    private String grade;

    @Column(name = "address")
    private String address;

    public Student() {
        super();
    }

    public Student(String name, String email, String grade, String address) {
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.address = address;
    }

    public Student(Long id, String name, String email, String grade, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s, email=%s, grade=%s, address=%s]", id, name, email, grade, address);
    }

}