/**
 * author Layangi
 */

package com.grading.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "assignment")
public class Assignment implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String category;
    private String status;
    private Date submitted_date;
    private Date due_data;
    private String grade;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonManagedReference
    private Student student;

    @OneToMany(mappedBy="assignment")
    @JsonBackReference
    private List<Question> questions;

    public Assignment() {
        super();
    }

    public Assignment(Long id, String name, String category, String status, Date submitted_date, Date due_data, String grade, Student student) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.status = status;
        this.submitted_date = submitted_date;
        this.due_data = due_data;
        this.grade = grade;
        this.student = student;
    }

    public Assignment(String name, String category, String status, Date submitted_date, Date due_data, String grade, Student student) {
        this.name = name;
        this.category = category;
        this.status = status;
        this.submitted_date = submitted_date;
        this.due_data = due_data;
        this.grade = grade;
        this.student = student;
    }

    public Assignment(Long id, String name, String category, String status, Date submitted_date, Date due_data, String grade) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.status = status;
        this.submitted_date = submitted_date;
        this.due_data = due_data;
        this.grade = grade;
    }


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

    @Override
    public String toString() {
        return String.format("Assignment [id=%s, name=%s, category=%s, status=%s, submitted_date=%s, due_data=%s, grade=%s, student=%s]", id, name, category, status,submitted_date,due_data, grade, student);
    }

}
