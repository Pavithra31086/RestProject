package com.Library.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Library.demo.Model.Signup;
import com.Library.demo.Service.SignupService;

@RestController
public class SignupController {

	    @Autowired
		SignupService ss;
	    
	    @GetMapping("/getuser")
	    public List<Signup> getUserDetail()
	    {
	    	return ss.getUserDetail();
	    }
	    
	    @PostMapping("/saveuser")
	    public Signup saveUserDetail(@RequestBody Signup u)
	    {
	    	return ss.saveUserDetail(u);
	    }
	    
	    @DeleteMapping("/deleteuser/{id}")
	    public String deleteUserDetail(@PathVariable int id)
	    {
	    	ss.delete(id);
	    	return "deleted";
	    }
}
