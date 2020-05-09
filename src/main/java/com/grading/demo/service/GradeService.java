/**
 * author Layangi
 */

package com.grading.demo.service;

import com.grading.demo.dto.AssignmentDTO;
import com.grading.demo.dto.QuestionDTO;
import com.grading.demo.dto.StudentDTO;
import com.grading.demo.exceptions.RecordNotFoundException;

import java.util.List;

public interface GradeService {

    void addStudent(StudentDTO studentDTO);

    StudentDTO getStudentDetails(Long id) throws RecordNotFoundException;

    AssignmentDTO getAssignmentById(Long id) throws RecordNotFoundException;

    List<AssignmentDTO> getAssignmentList(Long id);

    List<QuestionDTO> getResults(Long id);
}
