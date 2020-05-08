package com.grading.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.grading.demo.enums.Result;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue
    private Long id;
    private String question;
    private String time_spent;
    private Integer attempts;

    @Enumerated(EnumType.STRING)
    @Column(name = "result" )
    private Result result;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    @JsonManagedReference
    private Assignment assignment;

    public Question() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTime_spent() {
        return time_spent;
    }

    public void setTime_spent(String time_spent) {
        this.time_spent = time_spent;
    }

    public Integer getAttempts() {
        return attempts;
    }

    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Question(Long id, String question, String time_spent, Integer attempts, Result result, Assignment assignment) {
        this.id = id;
        this.question = question;
        this.time_spent = time_spent;
        this.attempts = attempts;
        this.result = result;
        this.assignment = assignment;
    }



    @Override
    public String toString() {
        return String.format("Result [id=%s, question=%s, time_spent=%s, result=%s, attempts=%s, assignment=%s]", id, question, time_spent, result, attempts, assignment);
    }

}
