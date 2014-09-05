package com.exam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.exam.model.Option;
import com.exam.model.Question;

@Repository
public class QuestionsDaoImpl implements IQuestionDao{

	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Collection<Question> getAllQuestions() {
		StringBuilder query = new StringBuilder();
		final Map<Long,Question> questions = new HashMap<Long, Question>();
		query.append(" select q_id,q_text,q_type,options,answer from question ");
		jdbcTemplate.query(query.toString(), new RowMapper<Question>(){
			public Question mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				Question ques = new Question();
				
				ques.setId(rs.getLong("q_id"));
				ques.setText(rs.getString("q_text"));
				ques.setQuestionType(rs.getInt("q_type"));
				ques.setAnswer(rs.getString("answer"));
				questions.put(ques.getId(), ques);
				return ques;
			}
		});
		query = new StringBuilder();
		query.append(" select q_id,o_no,o_text from questions_options ");
		
		jdbcTemplate.query(query.toString(), new RowMapper<Option>(){
			public Option mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				Option op = new Option();
				op.setOptionNo(rs.getInt("o_no"));
				op.setOptionText(rs.getString("o_text"));
				op.setQuestionId(rs.getLong("q_id"));
				
				Question ques = questions.get(op.getQuestionId());
				ques.getOptionsList().add(op);
				questions.put(ques.getId(), ques);
				return op;
			}
		});
		return questions.values();
	}
	
}
