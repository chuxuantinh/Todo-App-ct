package com.app.springmaster.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.ModelAttribute;

@Entity
@Table(name = "Todo")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String user;


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String description;

	private Date deadline;

	public Todo() {
		super();
	}

	public Todo(String user, String desc, Date targetDate, boolean isDone) {
		super();
		this.user = user;
		this.description = desc;
		this.deadline = targetDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTargetDate() {
		return deadline;
	}

	public void setTargetDate(Date targetDate) {
		this.deadline = targetDate;
	}
}
