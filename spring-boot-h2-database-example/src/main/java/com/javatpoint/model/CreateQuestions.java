package com.javatpoint.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateQuestions {
	@JsonProperty("question")
	private List<Question> question = null;

	@JsonProperty("question")
	public List<Question> getQuestion() {
	return question;
	}

	@JsonProperty("question")
	public void setQuestion(List<Question> question) {
	this.question = question;
	}
}
