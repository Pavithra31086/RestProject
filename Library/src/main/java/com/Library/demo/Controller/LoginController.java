package com.Library.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Library.demo.Model.Login;
import com.Library.demo.Service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService ls;
	
	@PostMapping("/checkLogin")
	public String validatingUser(@RequestBody Login u)
	{
	System.out.println(u.getUsername());
		return ls.findUser(u.getUsername(),u.getPassword());
	}
	
    @PostMapping("/addUser")
    public String getDetails(@RequestBody Login u)
    {
         ls.saveUser(u);
         return "saved";
    }
}
