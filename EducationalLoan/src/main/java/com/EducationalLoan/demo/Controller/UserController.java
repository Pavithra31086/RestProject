package com.EducationalLoan.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EducationalLoan.demo.Model.LoginModel;
import com.EducationalLoan.demo.Model.UserModel;
import com.EducationalLoan.demo.Service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {

	@Autowired
	UserService userserv;
	
	@PostMapping("/login")
	public String validateUser(@RequestBody LoginModel u)
	{
		return userserv.findUser(u.getEmail(),u.getPassword());
	}
	
	@PostMapping("/save")
	public UserModel saveDetails(@RequestBody UserModel id)
	{
		return userserv.saveDetails(id);
	}
	
	@GetMapping("/fun")
	public List<UserModel> getDetails()
	{
		return userserv.getDetails();
	}

	@PutMapping("/fun1")
	public String update(@RequestBody UserModel id)
	{
		 userserv.update(id);
		 return "updated";
	}
	
	@DeleteMapping("/fun2/{id}")
	public String delete(@PathVariable int id)
	{
		 userserv.delete(id);
		 return "deleted";
	}
}
