package com.gadri.gadriquizapp.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadri.gadriquizapp.Model.Question;
import com.gadri.gadriquizapp.Repository.QuestionRepository;

@Service
public class QuestionService {
    
    @Autowired
    QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    public List<Question> getQuestionsByCategory(String Category) {
        return questionRepository.findByCategory(Category);
    }

    public String addQuestion(Question question) {
        questionRepository.save(question);
        return "Success";
    }

    public void delete(Question question) {
         questionRepository.delete(question);
    }

   
    public Question updateQuestion(int id){
          Question question = questionRepository.findById(id).get();
          question.setQuestion("What is the primary key in Java");
          question.setId(1);
           return questionRepository.save(question);
         
     }

     

    public Object findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public Question save(Question question) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }


   



}
