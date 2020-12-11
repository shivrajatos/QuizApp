package com.javatpoint.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.Student;
import com.javatpoint.service.QuestionService;
import com.javatpoint.service.StudentService;
import com.javatpoint.model.CreateQuestions;
import com.javatpoint.model.Question;
//creating RestController
@RestController
public class QuestionController 
{
//autowired the StudentService class
@Autowired
QuestionService questionService;
//creating a get mapping that retrieves all the students detail from the database 

@CrossOrigin
@PostMapping("/send")
public String getDetails(@RequestBody CreateQuestions que) {
	List <Question> questions = que.getQuestion();
	questionService.saveAll(questions);
	//System.out.println(que.getQuestionArray().size());
	return "Questions updated to database";
}

@GetMapping("/question")
private List<Question> getAllQuestion() 
{
return questionService.getAllQuestion();
}
}
