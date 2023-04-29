package com.Library.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library.demo.Model.Signup;
import com.Library.demo.Repository.SignupRepository;

@Service
public class SignupService {

	@Autowired
	SignupRepository sr;
	
	public List<Signup> getUserDetail()
	{
		return sr.findAll();
	}

	public Signup saveUserDetail(Signup u)
	{
		return sr.save(u);
	}
	public void delete(int id) {
		sr.deleteById(id);
	}
}
