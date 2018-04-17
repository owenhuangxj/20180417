package com.owen.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonAutoDetect(fieldVisibility=Visibility.ANY)
public class Article{
//	@XmlAttribute
	@JsonProperty(value="c")
	private String category;
//	@XmlElement
	@JsonProperty("t")
	private String title;
//	@XmlElement
	@JsonProperty("a")
	private String author;
//	@XmlElement
	@JsonProperty("e")
	private String email;
//	@XmlElement
	@JsonProperty("d")
	private String date;
	
	public Article(String category, String title, String author, String email, String date) {
		super();
		this.category = category;
		this.title = title;
		this.author = author;
		this.email = email;
		this.date = date;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Aticle [category=" + category + ", title=" + title + ", author=" + author + ", email=" + email
				+ ", date=" + date + "]";
	}
	
}
