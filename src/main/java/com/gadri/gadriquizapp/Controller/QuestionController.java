package com.gadri.gadriquizapp.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.gadri.gadriquizapp.Model.Question;
import com.gadri.gadriquizapp.Services.QuestionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
@RestController
@RequestMapping("/Question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public List<Question> getQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }


    @PostMapping("/add")
    @ResponseStatus(code =  HttpStatus.CREATED)
    public String addQuestion(@RequestBody Question question){
         return questionService.addQuestion(question);
        
    }

    @DeleteMapping("/delete")
    public void removeQuestion(@PathVariable Question question){
      questionService.delete(question);
    }

    @PutMapping("/update/{id}")
    public Question updateQuestion(@PathVariable int id, Question question){
       //Question question = questionService.findById(id).get();
         questionService.save(question);
         return question;
    }



}
