package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.Question;
public interface QuestionRepository extends CrudRepository<Question, String>
{
}
