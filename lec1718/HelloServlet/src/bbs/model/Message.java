package bbs.model;

import java.util.Date;

public class Message {
	String title;
	Date time;
	String author;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Message(String title, String author, Date time, String content) {
		super();
		this.title = title;
		this.time = time;
		this.author=author;
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	String content;
	

}
