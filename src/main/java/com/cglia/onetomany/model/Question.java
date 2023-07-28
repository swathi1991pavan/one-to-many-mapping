package com.cglia.onetomany.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity  
@Table(name="question")  
public class Question {    
  
@Id   
@GeneratedValue(strategy=GenerationType.IDENTITY) 
private int id;    
private String qname;    
  
@OneToMany(cascade = CascadeType.ALL)  
@JoinColumn(name="qid" , referencedColumnName="id")  

private List<Answer> answers;  

public Question() { }


public Question(int id, String qname, List<Answer> answers) {
	
	this.id = id;
	this.qname = qname;
	this.answers = answers;
}
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getQname() {  
    return qname;  
}  
public void setQname(String qname) {  
    this.qname = qname;  
}  
public List<Answer> getAnswers() {  
    return answers;  
}  
public void setAnswers(List<Answer> answers) {  
    this.answers = answers;  
}      
}  
