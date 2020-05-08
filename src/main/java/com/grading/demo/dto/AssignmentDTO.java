package com.grading.demo.dto;

import com.grading.demo.model.Student;

import java.util.Date;

public class AssignmentDTO {

    private Long id;
    private String name;
    private String category;
    private String status;
    private Date submitted_date;
    private Date due_data;
    private Student student;
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(Date submitted_date) {
        this.submitted_date = submitted_date;
    }

    public Date getDue_data() {
        return due_data;
    }

    public void setDue_data(Date due_data) {
        this.due_data = due_data;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
