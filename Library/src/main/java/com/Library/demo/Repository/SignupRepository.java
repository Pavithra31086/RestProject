package com.Library.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Library.demo.Model.Signup;

public interface SignupRepository extends JpaRepository<Signup,Integer>{

}
