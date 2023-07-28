package com.cglia.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.onetomany.model.Answer;


@Repository 
public interface AnswerJpaRepository extends JpaRepository<Answer, Integer> {
 

}

