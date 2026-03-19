package com.example.dday.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "grade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GradeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false)
    private Double score; // 0.0 to 100.0

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private StudentModel student;

}
