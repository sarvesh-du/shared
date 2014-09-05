package com.exam.model;

import java.util.ArrayList;
import java.util.List;

public class Question {

	private long id;
	
	private String text;
	
	private int options;
	
	private String answer;

	private int questionType;
	
	List<Option> optionsList = new ArrayList<Option>(4);
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the options
	 */
	public int getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(int options) {
		this.options = options;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @return the optionsList
	 */
	public List<Option> getOptionsList() {
		return optionsList;
	}

	/**
	 * @param optionsList the optionsList to set
	 */
	public void setOptionsList(List<Option> optionsList) {
		this.optionsList = optionsList;
	}
	
	/**
	 * @return the questionType
	 */
	public int getQuestionType() {
		return questionType;
	}
	/**
	 * @param questionType the questionType to set
	 */
	public void setQuestionType(int questionType) {
		this.questionType = questionType;
	}
}
