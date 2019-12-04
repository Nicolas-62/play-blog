package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Post extends IdModel{
	
	public String title;
	
	@Temporal(TemporalType.TIMESTAMP) // avoir type datetime en sql
	public Date date;
	
	@Column(columnDefinition = "TEXT")
	public String content;
	
	
	@OneToOne
	@JoinColumn(name="idAuthor") // par convention perso
	public User author;
	
	@ManyToMany
    @JoinTable(
            name = "Post_Tag",
            joinColumns = @JoinColumn(name = "idPost"),
            inverseJoinColumns = @JoinColumn(name = "idTag"))
	public List<Tag> tags;
	
	@OneToMany(mappedBy = "post")
	public List<Comment> comments;
	
	
}
