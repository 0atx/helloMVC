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

}
