package com.Library.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library.demo.Model.Login;
import com.Library.demo.Repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository lr;

	public Login saveUser(Login u)
	{
	    return lr.save(u);
	}
	public String findUser(String username,String password)
	{
		String result="";
		Login u=lr.findByUsername(username);
		if(u==null)
		{
			result="Invalid user";
		}
			else
			{
				if(u.getPassword().equals(password))
				{
					result="Login success";
				}
				else
				{
					result="Login failed";
				}
			}
		return result;
		
	}
}
