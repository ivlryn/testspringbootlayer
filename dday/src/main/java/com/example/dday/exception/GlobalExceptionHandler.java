package com.example.dday.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<String> handleNotFound(StudentNotFoundException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)            // ← 404 status
                .body(ex.getMessage());                  // ← "Student with id 5 not found"
    }

    @ExceptionHandler(InvalidGrade.class)      // ← "If it's THIS kind of problem..."
    public ResponseEntity<String> handleInvalidGrade(InvalidGrade ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)          // ← 400 status
                .body(ex.getMessage());                  // ← e.g. "Grade must be between 0-100"
    }
}
