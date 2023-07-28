package com.cglia.onetomany.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.onetomany.model.Answer;
import com.cglia.onetomany.model.Question;
import com.cglia.onetomany.repository.QuestionJpaRepository;
import com.cglia.onetomany.repository.QuestionRepository;


@Service
public class QuestionService implements QuestionRepository{


	@Autowired
    private QuestionJpaRepository questionJpaRepository;
	
	
	
	
    
	/*@Override
	public Question createQuestion() {
		   
		Answer first_ans=new Answer();    
		first_ans.setAnswername("Java is a programming language");    
		first_ans.setPostedBy("Ravi Malik");    
        
		Answer second_ans=new Answer();    
		second_ans.setAnswername("Java is a platform");    
		second_ans.setPostedBy("Sudhir Kumar");    
        
		/*Answer ans3=new Answer();    
		ans3.setAnswername("Servlet is an Interface");    
		ans3.setPostedBy("Jai Kumar");    
        
		Answer ans4=new Answer();    
		ans4.setAnswername("Servlet is an API");    
		ans4.setPostedBy("Arun");    */
        
		/*ArrayList<Answer> list1=new ArrayList<Answer>();    
		list1.add(first_ans);    
		list1.add(second_ans);    
        
		/*ArrayList<Answer> list2=new ArrayList<Answer>();    
		list2.add(ans3);    
		list2.add(ans4); */
		
		/*Question question=new Question();    
	    question.setQname("What is Java?");    
	    question.setAnswers(list1);    
	        
	    
	    return questionJpaRepository.save(question);
	
		
	}*/



	public ArrayList<Question> getQuestions() {
		List<Question> questionList = questionJpaRepository.findAll();
        ArrayList<Question> questions = new ArrayList<>(questionList);
        return questions;
		
	}



	public Question addQuestion(Question question) {
		questionJpaRepository.save(question);
	    return question;
	}



	



	
     


}
