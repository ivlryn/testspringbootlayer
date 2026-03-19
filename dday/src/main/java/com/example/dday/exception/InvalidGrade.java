package com.example.dday.exception;

public class InvalidGrade extends RuntimeException{

    public InvalidGrade(Double score) {
        super("Score"+score+"is incorrect, please input score between 0-100");
    }
}
