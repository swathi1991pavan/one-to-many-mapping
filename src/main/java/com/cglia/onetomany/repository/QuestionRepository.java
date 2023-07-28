package com.cglia.onetomany.repository;

import java.util.ArrayList;

import com.cglia.onetomany.model.Question;

public interface QuestionRepository {
		
	 Question addQuestion(Question question);
	
	 ArrayList<Question> getQuestions();
}
