package com.cglia.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.onetomany.model.Question;



@Repository 
public interface QuestionJpaRepository extends JpaRepository<Question, Integer> {
 

}
