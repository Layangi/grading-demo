package com.grading.demo.mapper;

import com.grading.demo.dto.AssignmentDTO;
import com.grading.demo.dto.QuestionDTO;
import com.grading.demo.dto.StudentDTO;
import com.grading.demo.model.Assignment;
import com.grading.demo.model.Question;
import com.grading.demo.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GradeMapper {

    public Student studentDTOToStudent(StudentDTO studentDTO) {

        if (studentDTO == null) {
            return null;
        }

        Student student = new Student();

        student.setId(studentDTO.getId());
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        student.setGrade(studentDTO.getGrade());
        student.setAddress(studentDTO.getAddress());

        return student;
    }

    public StudentDTO studentToStudentDTO(Student student) {

        if (student == null) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        studentDTO.setGrade(student.getGrade());
        studentDTO.setAddress(student.getAddress());
        studentDTO.setEmail(student.getEmail());

        List<AssignmentDTO> list = assignmentListToAssignmentDTOList(student.getAssignments());
        if (list != null) {
            studentDTO.setAssignments(list);
        }

        return studentDTO;
    }

    public List<AssignmentDTO> assignmentListToAssignmentDTOList(List<Assignment> assignmentList) {

        if ( assignmentList == null ) {
            return null;
        }

        List<AssignmentDTO> list = new ArrayList<AssignmentDTO>();

        for ( Assignment assignment : assignmentList ) {
            list.add(assignmentToAssignmentDTO(assignment));
        }

        return list;
    }

    public AssignmentDTO assignmentToAssignmentDTO(Assignment assignment) {

        if ( assignment == null ) {
            return null;
        }

        AssignmentDTO assignmentDTO = new AssignmentDTO();
        assignmentDTO.setId(assignment.getId());
        assignmentDTO.setName(assignment.getName());
        assignmentDTO.setStatus(assignment.getStatus());
        assignmentDTO.setCategory(assignment.getCategory());
        assignmentDTO.setDue_data(assignment.getDue_data());
        assignmentDTO.setSubmitted_date(assignment.getSubmitted_date());
        assignmentDTO.setGrade(assignment.getGrade());
        assignmentDTO.setStudent(assignment.getStudent());

        return assignmentDTO;
    }

    public List<QuestionDTO> questionsListToQuestionsDTOLIST(List<Question> questionList) {

        if ( questionList == null ) {
            return null;
        }

        List<QuestionDTO> list = new ArrayList<QuestionDTO>();

        for ( Question question : questionList ) {
            list.add(questionToQuestionDTO(question));
        }

        return list;
    }

    public QuestionDTO questionToQuestionDTO(Question question) {

        if ( question == null ) {
            return null;
        }

        QuestionDTO questionDTO = new QuestionDTO();

        questionDTO.setId(question.getId());
        questionDTO.setQuestion(question.getQuestion());
        questionDTO.setAttempts(question.getAttempts());
        questionDTO.setResult(question.getResult());
        questionDTO.setTime_spent(question.getTime_spent());
        questionDTO.setAssignment(question.getAssignment());

        return questionDTO;
    }

}
