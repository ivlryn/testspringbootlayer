package com.example.dday.mapper;

import com.example.dday.dto.StudentRequest;
import com.example.dday.dto.StudentResponse;
import com.example.dday.model.StudentModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentMapper {
    StudentResponse tostudentResponse(StudentModel student);
    StudentModel toEntity(StudentRequest dto);
}
