package com.example.dday.mapper;

import com.example.dday.dto.GradeResponse;
import com.example.dday.model.GradeModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GradeMapper {
    @Mapping(target = "studentName", source = "student.name")
    @Mapping(target = "score", source = "score")
    @Mapping(target = "status",
            expression = "java(grade.getScore() >= 50 ? \"PASS\" : \"FAIL\")")
    GradeResponse toGradeResponse(GradeModel grade);

}
