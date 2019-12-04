package models;

import java.util.List;

import javax.persistence.ManyToMany;

public class Tag extends IdModel{
	public String name;
	
	@ManyToMany(mappedBy = "tags")	
	public List<Post> posts;

}
