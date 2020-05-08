package com.grading.demo.repository;

import com.grading.demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> , JpaSpecificationExecutor<Question> {

    List<Question> findByAssignment_Id(@Param("assignment_id") Long id);
}
