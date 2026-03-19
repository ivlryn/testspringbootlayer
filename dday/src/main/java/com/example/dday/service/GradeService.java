package com.example.dday.service;

import com.example.dday.dto.GradeResponse;

import java.util.List;

public interface GradeService {
    GradeResponse addGrade(Long studentId, GradeResponse dto);

    List<GradeResponse> getGradesByStudent(Long studentId);

    void deleteGrade(Long gradeId); // optional

    GradeResponse updateGrade(Long gradeId, GradeResponse dto);
}
