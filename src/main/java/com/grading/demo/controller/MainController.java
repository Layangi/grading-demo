package com.grading.demo.controller;

import com.grading.demo.dto.AssignmentDTO;
import com.grading.demo.dto.QuestionDTO;
import com.grading.demo.dto.StudentDTO;
import com.grading.demo.exceptions.RecordExits;
import com.grading.demo.exceptions.RecordNotFoundException;
import com.grading.demo.model.Assignment;
import com.grading.demo.repository.AssignmentRepository;
import com.grading.demo.repository.StudentRepository;
import com.grading.demo.service.GradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
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

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AssignmentRepository assignmentRepository;

    // api for the teacher to add students
    @PostMapping("/add/students")
    public void addStudent(@RequestBody StudentDTO studentDTO) {

        LOG.info("[MainController]:HTTP POST --> addStudent --> /collections");
        gradeService.addStudent(studentDTO);

    }

//    @GetMapping("/stu")
//    public void getAssignmentss() {
////
////        LOG.info("[MainController]:HTTP GET --> getAssignments --> /get/Assignments");
////        studentRepository.findById("STU-01");
////        System.out.println("ss: " + studentRepository.findById("STU-01"));
////
////
////        studentRepository.findAll();
////
////        System.out.println("All: " +  studentRepository.findAll());
//
//
//       // logger.info("Student id 10001 -> {}", repository.findById(10001L));
//
//       // logger.info("Inserting -> {}", repository.save(new Student("ddd", "A1234657")));
//
//       // logger.info("Update 10003 -> {}", repository.save(new Student(10001L, "Name-Updated", "New-Passport")));
//
//        //repository.deleteById(10002L);
//
//        logger.info("All users -> {}", studentRepository.findAll());
//
//        logger.info("Assignments -> {}" , assignmentRepository.findByStudent_Id(10002L));
//
//        //logger.info("Assignments -> {}" , assignmentRepository.find());
//
////        logger.info("Assignment ID: " , assignmentRepository.findById(1006L));
//    }

//    //api for getting Assignments per the student
//    @GetMapping("/get/Assignments/{id}")
//    public ResponseEntity<List<Assignment>> getAssignments(@PathVariable(value = "id") Long student_Id) {
//
//        LOG.info("[MainController]:HTTP GET --> getAssignments --> /get/Assignments");
//
//        List<Assignment> assignmentList = gradeService.getAssignments(student_Id);
//
//        logger.info("Assignments 2-> {}" , gradeService.getAssignments(student_Id));
//
//       // return assignmentList;
//
//        return new ResponseEntity<List<Assignment>>(assignmentList, new HttpHeaders(), HttpStatus.OK);
//
//    }

    //api for getting a particular student details
    @RequestMapping(value= "/student/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
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

    //For getting
    @GetMapping("/{id}")
    public ResponseEntity<Assignment> getAssignmentByIds(@PathVariable("id") Long id) {

        LOG.info("[MainController]:HTTP GET --> getAssignmentList --> /list");
        Assignment entity = gradeService.getAssignmentByIdList(id);

        return new ResponseEntity<>(entity, new HttpHeaders(), HttpStatus.OK);

        //System.out.println("",new ResponseEntity<>(entity, new HttpHeaders(), HttpStatus.OK));
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

}