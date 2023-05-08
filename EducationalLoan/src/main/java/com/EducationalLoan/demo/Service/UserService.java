package com.EducationalLoan.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EducationalLoan.demo.Model.UserModel;
import com.EducationalLoan.demo.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userrepo;
	
	public String findUser(String email,String password)
	{
		String result="";
		UserModel u=userrepo.findByEmail(email);
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
	
	public UserModel saveDetails(UserModel id){
		return userrepo.save(id);
	}
	
	public List<UserModel> getDetails(){
		return userrepo.findAll();
	}
	
	public UserModel update(UserModel id) {
		return userrepo.save(id);
	}
	
	public void delete(int id) {
		userrepo.deleteById(id);
	}
}
