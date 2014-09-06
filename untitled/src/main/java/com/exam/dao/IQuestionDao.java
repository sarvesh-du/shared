/**
 * 
 */
package com.exam.dao;

import java.util.Collection;
import java.util.List;

import com.exam.model.Question;

/**
 * @author sarvesh
 *
 */
public interface IQuestionDao {

	/**
	 * Gets the all questions.
	 *
	 * @return the all questions
	 */
	Collection<Question> getAllQuestions();
}
