package com.cglia.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.onetomany.dto.ExamRequest;
import com.cglia.onetomany.model.Question;
import com.cglia.onetomany.repository.AnswerJpaRepository;
import com.cglia.onetomany.repository.QuestionJpaRepository;


@RestController
@RequestMapping("/api/examQuestions")

public class Examcontroller {
	
	@Autowired
    public QuestionJpaRepository questionRepository ;
	
	@Autowired
	public AnswerJpaRepository answerRepository;
	
	@PostMapping
	public Question placeQuestion(@RequestBody Question request) {
		return questionRepository.save(request);
	
	}
	
	@GetMapping()
	public List<Question> findAllQuestions(){
		return questionRepository.findAll();
	}

}
