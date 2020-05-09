/**
 * author Layangi
 */

package com.grading.demo.dto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentDTOTest {

    private StudentDTO studentDTO;

    @Before
    public void setUp(){

        studentDTO = new StudentDTO();
        studentDTO.setId(12345L);
        studentDTO.setEmail("test@gmail.com");
        studentDTO.setAddress("Kandy");
        studentDTO.setGrade("Class 10");
        studentDTO.setName("June");

        ArrayList<AssignmentDTO> assignmentDTOList = new ArrayList<>();
        AssignmentDTO assignmentDTO = new AssignmentDTO();

        assignmentDTOList.add(assignmentDTO);
        studentDTO.setAssignments(assignmentDTOList);

    }

    @Test
    public void testGetName(){
        Assert.assertEquals("June",studentDTO.getName());
    }

    @Test
    public void testGetId(){
        Assert.assertNotNull(studentDTO.getId());
    }

    @Test
    public void testGetAssignments(){
        Assert.assertNotNull(studentDTO.getAssignments());
    }

    @Test
    public void testGetGrade(){
        Assert.assertEquals("Class 10",studentDTO.getGrade());
    }

    @Test
    public void testGetAddress(){
        Assert.assertEquals("Kandy",studentDTO.getAddress());
    }

    @Test
    public void testGetEmail(){
        Assert.assertEquals("test@gmail.com",studentDTO.getEmail());
    }
}
