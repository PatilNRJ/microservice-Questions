package com.questions.QuestionServices.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questions.QuestionServices.Entity.QuestionEntity;

public interface QuestionRepo extends JpaRepository<QuestionEntity, Long>{

	List<QuestionEntity> findByQuizId(Long quizId);
}
