package com.Library.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Signup {

	@Id
	private int userid;
    @Column(name="firstname")
	private String firstname;
    @Column(name="lastname")
	private String lastname;
    @Column(name="gender")
    private String gender;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="mobileno")
    private long mobileno;
    @Column(name="age")
    private int age;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Signup(int userid, String firstname, String lastname, String gender, String email, String password,
			long mobileno, int age) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
		this.age = age;
	}
	public Signup() {
		super();
	}
	@Override
	public String toString() {
		return "Signup [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", email=" + email + ", password=" + password + ", mobileno=" + mobileno + ", age=" + age + "]";
	}
    
    
}
