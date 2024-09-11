package com.questions.QuestionServices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questions.QuestionServices.Entity.QuestionEntity;
import com.questions.QuestionServices.Services.QuestionServices;

@RestController
@RequestMapping("/question")
public class Controller {
	
	@Autowired
	public QuestionServices questionService;
	
	@PostMapping("/question")
	public QuestionEntity create(@RequestBody QuestionEntity questionEntity) {
		return questionService.add(questionEntity);
	}
	
	@GetMapping("/question")
	public List<QuestionEntity> get(){
		return questionService.get();
	}
	
	@GetMapping("/{id}")
	public QuestionEntity getOne(@PathVariable Long id) {
		return questionService.get(id);
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<QuestionEntity> getQuestionsofQuiz(@PathVariable Long quizId){
		return questionService.getQuestionsByQuizId(quizId);
	}
	

}
