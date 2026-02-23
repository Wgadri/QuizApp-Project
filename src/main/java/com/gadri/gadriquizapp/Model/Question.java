package com.gadri.gadriquizapp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "quiz_questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String difficultly;
    @Column(name = "correct_answer")
    private String correctAnswer;
    private String category;
    private String question;

}
