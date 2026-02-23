package com.gadri.gadriquizapp.Repository;

import com.gadri.gadriquizapp.Model.Question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

    List<Question> findByCategory(String Category);

    // JpaRepository provides findAll(), no need for custom method

}
