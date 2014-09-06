/**
 * 
 */
package com.exam.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.dao.IQuestionDao;
import com.exam.model.Question;

/**
 * @author sarvesh
 *
 */
@Controller
public class QuestionController {

	@Autowired
	private IQuestionDao questionDao;
	
	@RequestMapping(value="/getAllQuestions", method = RequestMethod.GET)
	public @ResponseBody Collection<Question> getAllQuestions() {
		return this.questionDao.getAllQuestions();
	}
}
