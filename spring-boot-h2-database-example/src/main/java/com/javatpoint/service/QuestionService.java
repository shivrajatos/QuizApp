package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Question;
import com.javatpoint.repository.QuestionRepository;
//defining the business logic
@Service
public class QuestionService 
{
@Autowired
QuestionRepository questionRepository;
//getting all question records
public List<Question> getAllQuestion() 
{
List<Question> questions = new ArrayList<Question>();
questionRepository.findAll().forEach(Question -> questions.add(Question));
return questions;
}
//getting a specific record
/*
 * public Question getQuestionById(int id) { return
 * questionRepository.findById(id).get(); }
 */
public void saveOrUpdate(Question question) 
{
questionRepository.save(question);
}

public void saveAll(List<Question> questions) 
{
questionRepository.saveAll(questions);
}
//deleting a specific record
/*
 * public void delete(int id) { questionRepository.deleteById(id); }
 */
}