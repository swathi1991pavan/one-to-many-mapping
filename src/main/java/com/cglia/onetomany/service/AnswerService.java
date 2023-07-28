package com.cglia.onetomany.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.onetomany.model.Answer;
import com.cglia.onetomany.model.Question;
import com.cglia.onetomany.repository.AnswerJpaRepository;
import com.cglia.onetomany.repository.AnswerRepository;
import com.cglia.onetomany.repository.QuestionJpaRepository;
import com.cglia.onetomany.repository.QuestionRepository;

@Service
public class AnswerService implements AnswerRepository{
	
	@Autowired
    private AnswerJpaRepository answerJpaRepository;
	
	public Answer addAnswer(Answer answer) {
		answerJpaRepository.save(answer);
	    return answer;
	}
	
	
}
