//package com.grading.demo.controller;
//
//import com.grading.demo.dto.AssignmentDTO;
//import com.grading.demo.dto.StudentDTO;
//import com.grading.demo.repository.StudentRepository;
//import com.grading.demo.service.GradeService;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(MockitoJUnitRunner.class)
//public class MainControllerTest {
//
//    @Mock
//    private MainController mainController;
//
//    @Mock
//    private GradeService gradeService;
//
//    @Mock
//    private StudentRepository studentRepository;
//
//    private StudentDTO studentDTO;
//
//    private AssignmentDTO assignmentDTO;
//
//    private MockMvc mockMvc;
//
//    private final Long id = 10001L;
//
//
//    @Before
//    public void setUp(){
//        this.mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
//       // MockitoAnnotations.initMocks(this);
//        studentDTO = new StudentDTO();
//        assignmentDTO = new AssignmentDTO();
//    }
//
//
////    @Test
////    public void testGetStudentDetails() throws Exception {
////        Mockito.when(gradeService.getStudentDetails(Mockito.anyLong())).thenReturn(studentDTO);
////
////        mockMvc.perform(MockMvcRequestBuilders.post("/grading/student" + id ))
////                .andExpect(status().isOk());
////    }
//
//
//}
