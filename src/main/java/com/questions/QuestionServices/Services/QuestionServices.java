package com.questions.QuestionServices.Services;

import java.util.List;

import com.questions.QuestionServices.Entity.QuestionEntity;

public interface QuestionServices {
	
	QuestionEntity add(QuestionEntity questionEntity);
	
	List<QuestionEntity> get();
	
	QuestionEntity get(Long id);
	
	List<QuestionEntity> getQuestionsByQuizId(Long QuizId);

}
