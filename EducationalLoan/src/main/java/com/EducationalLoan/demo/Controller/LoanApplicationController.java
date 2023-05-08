package com.EducationalLoan.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EducationalLoan.demo.Model.LoanApplicationModel;
import com.EducationalLoan.demo.Service.LoanApplicationService;

@RestController
public class LoanApplicationController {

	@Autowired
	LoanApplicationService las;
	
	@GetMapping("/get")
	public List<LoanApplicationModel> get(){
		return las.getDetails();
	}
	
	@PostMapping("/post")
	public LoanApplicationModel save(LoanApplicationModel id) {
		return las.save(id);
	}
	
	@PutMapping("/put")
	public String update(LoanApplicationModel id) {
		las.save(id);
		return "updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(int id) {
		las.delete(id);
		return "deleted";
	}
	
}
