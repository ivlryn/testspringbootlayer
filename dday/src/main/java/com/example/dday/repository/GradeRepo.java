package com.example.dday.repository;

import com.example.dday.model.GradeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepo extends JpaRepository<GradeModel, Long> {
    List<GradeModel> findByStudentId(Long studentId);
}
