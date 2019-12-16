package com.wf.ms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Todo {

	@Id
	@GeneratedValue
	private int id;
	
	@NotBlank (message = "user cannot be blank")
	@NotEmpty (message = "user cannot be empty")
	@NotNull  (message = "user cannot be Null")
	private String user;
	
	@Size(min = 5, max = 50, message = "Description should be b/w 5 to 50 characters")
	private String des;
	
	private Date targetDate;
	
	private boolean done;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	public Todo() {
		// TODO Auto-generated constructor stub
	}

	public Todo(int id, String user, String des, Date targetDate, boolean done) {
		super();
		this.id = id;
		this.user = user;
		this.des = des;
		this.targetDate = targetDate;
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", user=" + user + ", des=" + des + ", targetDate=" + targetDate + ", done=" + done
				+ "]";
	}
	

}
