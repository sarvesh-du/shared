/**
 * 
 */
package com.exam.model;

/**
 * @author sarvesh
 *
 */
public class Option implements Comparable<Option>{

	private long questionId;
	private String optionText;
	private int optionNo;
	
	/**
	 * @return the questionId
	 */
	public long getQuestionId() {
		return questionId;
	}
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	/**
	 * @return the optionText
	 */
	public String getOptionText() {
		return optionText;
	}
	/**
	 * @param optionText the optionText to set
	 */
	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}
	/**
	 * @return the optionNo
	 */
	public int getOptionNo() {
		return optionNo;
	}
	/**
	 * @param optionNo the optionNo to set
	 */
	public void setOptionNo(int optionNo) {
		this.optionNo = optionNo;
	}
	public int compareTo(Option o) {
		return new Integer(this.optionNo).compareTo(o.optionNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Option) {
			Option other = (Option) obj;
			return this.questionId == other.questionId 
					&& this.optionNo == other.optionNo;
		}
		return false;
	}

	
}
