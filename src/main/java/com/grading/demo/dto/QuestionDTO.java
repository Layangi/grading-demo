package com.grading.demo.dto;

import com.grading.demo.enums.Result;
import com.grading.demo.model.Assignment;

public class QuestionDTO {

    private Long id;
    private String question;
    private String time_spent;
    private Integer attempts;
    private Result result;
    private Assignment assignment;

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

}
