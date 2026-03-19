package com.example.dday.repository;

import com.example.dday.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Long> {
    boolean existsByEmail(String email);
}
