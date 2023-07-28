package com.cglia.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.onetomany.model.Answer;
import com.cglia.onetomany.model.Question;
import com.cglia.onetomany.service.AnswerService;
import com.cglia.onetomany.service.QuestionService;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {
	

	@Autowired
    public AnswerService answerService ;
	
	@PostMapping
	public Answer addAnswer( @RequestBody Answer answer) {
		return answerService.addAnswer(answer);
	}
}
