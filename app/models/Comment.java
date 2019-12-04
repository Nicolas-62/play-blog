package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Comment extends IdModel {
	
	@Column(columnDefinition = "TEXT")
	public String content;
	@Temporal(TemporalType.TIMESTAMP) // avoir type datetime en sql
	public Date date;
	
	@OneToOne
	@JoinColumn(name = "idAuthor")
	public User author;
	
	@OneToOne
	@JoinColumn(name = "idPost")
	public Post post;

}
