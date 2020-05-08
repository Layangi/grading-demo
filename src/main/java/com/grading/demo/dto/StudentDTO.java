package com.grading.demo.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDTO {

    private Long id;
    private String name;
    private String email;
    private String grade;
    private String address;
    private List<AssignmentDTO> assignments;

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

    public List<AssignmentDTO> getAssignments() {
        return Optional.ofNullable(assignments).map(ArrayList::new).orElse(null);
    }

    public void setAssignments(List<AssignmentDTO> assignments) {
        this.assignments = Optional.ofNullable(assignments).map(ArrayList::new).orElse(null);
    }

}
