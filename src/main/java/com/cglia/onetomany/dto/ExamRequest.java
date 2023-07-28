package com.cglia.onetomany.dto;

import com.cglia.onetomany.model.Question;

public class ExamRequest {
	private Question question;
	 
	public ExamRequest() {}
	 
	public ExamRequest(Question question) {
		super();
		this.question = question;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
}
