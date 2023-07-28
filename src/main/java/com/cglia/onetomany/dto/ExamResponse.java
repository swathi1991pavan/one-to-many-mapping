package com.cglia.onetomany.dto;

public class ExamResponse {
	private String qname;
	private String answers;
	
	public ExamResponse() { }
	
	public ExamResponse(String qname, String answers) {
		super();
		this.qname = qname;
		this.answers = answers;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	
	
}
