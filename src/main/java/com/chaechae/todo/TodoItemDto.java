package com.chaechae.todo;

import java.util.Date;

public class TodoItemDto {
	
	private long seq;
	private String title;
	private String content;
	private Date startDt;
	private Boolean completed;
	private Date regDt;
	private Date modiDt;
	
	public long getSeq() {
		return this.seq;
	}
	
	public void setSeq(long seq) {
		this.seq = seq;
	}
	
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getStartDt() {
		return this.startDt;
	}
	
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	// Boolean은 get이 아닌, is로 써야함
	public Boolean isCompleted() {
		return this.completed;
	}
	
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
	public Date getModiDt() {
		return this.modiDt;
	}
	
	public void setMiduDt(Date modiDt) {
		this.modiDt = modiDt;
	}
	public Date getRegDt() {
		return this.regDt;
	}
	
	public void setRegtDt(Date regDt) {
		this.regDt = regDt;
	}
	
	
}