package models;

import java.util.List;

import javax.persistence.OneToMany;

public class User extends IdModel {
	
	public String email;
	public String password;
	public String firstName;
	public String lastName;
	public boolean isAdmin;
	
//	@OneToMany(mappedBy = "author")
//	public List<User> users;
//	

}
