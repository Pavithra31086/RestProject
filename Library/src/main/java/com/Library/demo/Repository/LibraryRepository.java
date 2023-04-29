package com.Library.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Library.demo.Model.Library;

public interface LibraryRepository extends JpaRepository<Library,Integer>{

	List<Library> findByTitleStartingWith(String prefix);
	List<Library> findByTitleEndingWith(String suffix);
	List<Library> findByAuthor(String author);
	
	//POSITIONAL PARAMETER WE USE ?
	@Query("select lib from Library lib where lib.author=?1 and lib.title=?2")
	public List<Library> getAuthor(String author,String title);
	
	//NAMED PARAMETER WE USE PARAMETER NAME
	@Query("select lib from Library lib where lib.author=:author")
	public List<Library> getAuthorDetail(String author);
	
	//DML-DELETE
	/*@Modifying
	@Query("delete lib from Library lib where lib.author=?1")
	public int deleteAuthor(String author);*/
}
