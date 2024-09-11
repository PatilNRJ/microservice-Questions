package com.questions.QuestionServices.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questions.QuestionServices.Entity.QuestionEntity;
import com.questions.QuestionServices.Repo.QuestionRepo;
import com.questions.QuestionServices.Services.QuestionServices;

@Service
public class QuestionServiceImpl implements QuestionServices{

	@Autowired
	private QuestionRepo questionRepo;
	
	
	@Override
	public QuestionEntity add(QuestionEntity questionEntity) {
		// TODO Auto-generated method stub
		return questionRepo.save(questionEntity);
	}

	@Override
	public List<QuestionEntity> get() {
		// TODO Auto-generated method stub
		return questionRepo.findAll();
	}

	@Override
	public QuestionEntity get(Long id) {
		// TODO Auto-generated method stub
		return questionRepo.findById(id).orElseThrow(()-> new RuntimeException ("Question Not Found!!"));
	}

	@Override
	public List<QuestionEntity> getQuestionsByQuizId(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepo.findByQuizId(quizId);
	}

}
