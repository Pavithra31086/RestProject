package com.Library.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.Library.demo.Model.Library;
import com.Library.demo.Repository.LibraryRepository;


@Service
public class LibraryService {

	@Autowired
	LibraryRepository lr;
	
	//GET METHOD
	public List<Library> getDetails()
	{
		return lr.findAll();
	}
	
	//POST METHOD
	public Library save(Library id)
	{
		return lr.save(id);
	}
	
	//PUT METHOD
	public Library update(Library id)
	{
		return lr.save(id);
	}
	
	//FIND BY ID METHOD
	public Optional<Library> find(int id) 
	{
		return lr.findById(id);
	}
	
	//DELETE METHOD
	public void delete(int id) 
	{
		lr.deleteById(id);
	}
	
	//SORTING
	public List<Library>sortLibrary(String field)
	{
		return lr.findAll(Sort.by(Direction.DESC,field));
		
	}
	
	//PAGINATION
	public List<Library>pagingLibrary(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset, pageSize);
		Page<Library> obj = lr.findAll(paging);
	    List<Library>sc=obj.getContent();
	    return sc;
		
	}
	
	//PAGINATION WITHOUT GETCONTENT()
	public Page<Library>pageableLibrary(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset, pageSize);
		Page<Library> obj = lr.findAll(paging);
	    return obj;	
	}
	
	//PAGINATION WITH SORTING
	public List<Library>pagingLibrary(int offset,int pageSize,String field)
	{
		Pageable paging=PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		Page<Library> obj = lr.findAll(paging);
	    List<Library>sc=obj.getContent();
	    return sc;
	}
	
	//JPQL METHODS
	public List<Library> fetchTitle(String prefix){
		return lr.findByTitleStartingWith(prefix);
	}
	
	public List<Library> fetchingTitle(String suffix){
		return lr.findByTitleEndingWith(suffix);
	}
	
	public List<Library> fetchAuthor(String author){
		return lr.findByAuthor(author);
	}
	
	public List<Library> setAuthor(String author,String title){
		return lr.getAuthor(author, title);
	}
	
	public List<Library> setByAuthor(String author){
		return lr.getAuthorDetail(author);
	}
	
	/*@Transactional
	public int deleteByAuthor(String author){
		return lr.deleteAuthor(author);
	}*/
}
