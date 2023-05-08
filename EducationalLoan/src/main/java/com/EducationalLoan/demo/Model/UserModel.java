package com.EducationalLoan.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String email;
	private String password;
	private String username;
	private String mobilenumber;
	private String userrole;
	public UserModel() {}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public UserModel(int id, String email, String password, String username, String mobilenumber, String userrole) {
		super();
		Id = id;
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobilenumber = mobilenumber;
		this.userrole = userrole;
	}
	@Override
	public String toString() {
		return "UserModel [Id=" + Id + ", email=" + email + ", password=" + password + ", username=" + username
				+ ", mobilenumber=" + mobilenumber + ", userrole=" + userrole + "]";
	}
	
	
	
}
