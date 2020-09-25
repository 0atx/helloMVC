package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {

	private String id;
	private String password;
	private String name;
	private String gender;
	private String email;
	
	public Customer() { super(); }

	public Customer(String id, String password, String name, String gender, String email) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}
	
	public String getEmail() {
		return email;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
