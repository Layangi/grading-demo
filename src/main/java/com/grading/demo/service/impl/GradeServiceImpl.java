package com.grading.demo.service.impl;

import com.grading.demo.dto.AssignmentDTO;
import com.grading.demo.dto.QuestionDTO;
import com.grading.demo.dto.StudentDTO;
import com.grading.demo.exceptions.RecordNotFoundException;
import com.grading.demo.mapper.GradeMapper;
import com.grading.demo.model.Assignment;
import com.grading.demo.model.Question;
import com.grading.demo.model.Student;
import com.grading.demo.repository.AssignmentRepository;
import com.grading.demo.repository.QuestionRepository;
import com.grading.demo.repository.StudentRepository;
import com.grading.demo.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradeServiceImpl implements GradeService {


    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AssignmentRepository assignmentRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public void addStudent(StudentDTO studentDTO) {

        Student student = gradeMapper.studentDTOToStudent(studentDTO);

        studentRepository.save(student);
        //studentRepository.flush();
    }

    @Override
    public List<Assignment> getAssignments(Long student_id) {

        List<Assignment> assignmentList = assignmentRepository.findByStudent_Id(student_id);

//    {
//        List<EmployeeEntity> employeeList = repository.findAll();
//
//        if(employeeList.size() > 0) {
//            return employeeList;
//        } else {
//            return new ArrayList<EmployeeEntity>();
//        }
//    }

        // return gradeMapper.assignmentListToAssignmentDTOList(assignmentList);
        return assignmentList;
    }

    @Override
    public Assignment getAssignmentByIdList(Long id) {

        Optional<Assignment> assignment = assignmentRepository.findById(id);
//
//        if(employee.isPresent()) {
//            return employee.get();
//        } else {
//            throw new RecordNotFoundException("No employee record exist for given id");
//        }
        return assignment.get();
    }

    @Override
    public StudentDTO getStudentDetails(Long id) throws RecordNotFoundException {

        Optional<Student> student = studentRepository.findById(id);

        if (student.isPresent()) {
            return gradeMapper.studentToStudentDTO(student.get());
        } else {
            throw new RecordNotFoundException("No student record found for the given id");
        }

    }

    @Override
    public AssignmentDTO getAssignmentById(Long id) throws RecordNotFoundException {

        Optional<Assignment> assignment = assignmentRepository.findById(id);

        if (assignment.isPresent()) {
            return gradeMapper.assignmentToAssignmentDTO(assignment.get());
        } else {
            throw new RecordNotFoundException("No assignments found for the given id");
        }
    }

    @Override
    public List<AssignmentDTO> getAssignmentList(Long id) {

        List<Assignment> assignmentList = assignmentRepository.findByStudent_Id(id);

        return gradeMapper.assignmentListToAssignmentDTOList(assignmentList);
    }

    @Override
    public List<QuestionDTO> getResults(Long id) {

        List<Question> questions = questionRepository.findByAssignment_Id(id);

        return gradeMapper.questionsListToQuestionsDTOLIST(questions);
    }

}
