/**
 * author Layangi
 */

package com.grading.demo.controller;

import com.grading.demo.dto.AssignmentDTO;
import com.grading.demo.dto.QuestionDTO;
import com.grading.demo.dto.StudentDTO;
import com.grading.demo.exceptions.RecordNotFoundException;
import com.grading.demo.service.GradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grading")
//@CrossOrigin
public class MainController {

    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private GradeService gradeService;

    //api for getting a particular student details
    @GetMapping("/student/{id}")
    public ResponseEntity<StudentDTO> getStudentDetails(@PathVariable("id") Long id) throws RecordNotFoundException {

        LOG.info("[MainController]:HTTP GET --> getStudentDetails --> /student/");
        StudentDTO res =  gradeService.getStudentDetails(id);

        return ResponseEntity.ok(res);
    }

    //api for getting particular assignment details
    @RequestMapping(value= "/assignment/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AssignmentDTO> getAssignmentDetails(@PathVariable("id") Long id) throws RecordNotFoundException {

        LOG.info("[MainController]:HTTP GET --> getAssignmentDetails --> /assignment/");
        AssignmentDTO result = gradeService.getAssignmentById(id);

        return ResponseEntity.ok(result);
    }

    // api for getting the assignments list per student
    @GetMapping("/list/{student_id}")
    public ResponseEntity<List<AssignmentDTO>> getAssignmentList(@PathVariable("student_id") Long id) {

        LOG.info("[MainController]:HTTP GET --> getAssignmentList --> /list");

        List<AssignmentDTO> assignmentList = gradeService.getAssignmentList(id);
        return ResponseEntity.ok(assignmentList);
    }

    // api for getting the results per assignment
    @GetMapping("/results/{assignment_id}")
    public ResponseEntity<List<QuestionDTO>> getResults(@PathVariable("assignment_id") Long id) {

        LOG.info("[MainController]:HTTP GET --> getResults --> /results");

        List<QuestionDTO> results = gradeService.getResults(id);
        return ResponseEntity.ok(results);
    }

    // api for the teacher to add students
    @PostMapping("/add/students")
    public void addStudent(@RequestBody StudentDTO studentDTO) {

        LOG.info("[MainController]:HTTP POST --> addStudent --> /collections");
        gradeService.addStudent(studentDTO);

    }
}