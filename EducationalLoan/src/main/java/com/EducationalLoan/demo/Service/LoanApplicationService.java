package com.EducationalLoan.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EducationalLoan.demo.Model.LoanApplicationModel;
import com.EducationalLoan.demo.Repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {

	@Autowired
	LoanApplicationRepository lar;
	
	public List<LoanApplicationModel> getDetails(){
		return lar.findAll();
	}
	
	public LoanApplicationModel save(LoanApplicationModel id) {
		return lar.save(id);
	}
	
	public LoanApplicationModel update(LoanApplicationModel id) {
		return lar.save(id);
	}
	
	public void delete(int id) {
		 lar.deleteById(id);
	}
}
