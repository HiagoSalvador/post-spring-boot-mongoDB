package com.post.commentmongo.dto;

import java.io.Serializable;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String text;
	private java.util.Date date;
	private AuthorDTO author;

	public CommentDTO() {

	}

	public CommentDTO(String text, java.util.Date date, AuthorDTO author) {
		super();
		this.text = text;
		this.setDate(date);
		this.author = author;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

}
