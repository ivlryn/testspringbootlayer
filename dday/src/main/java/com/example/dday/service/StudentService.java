package com.example.dday.service;

import com.example.dday.dto.StudentResponse;

import java.util.List;

public interface StudentService {
    List<StudentResponse> findAll();

    StudentResponse findById(Long id);

    StudentResponse create(StudentResponse dto);

    StudentResponse update(Long id, StudentResponse dto);

    void delete(Long id);

}
