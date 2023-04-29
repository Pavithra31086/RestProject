package com.Library.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Library.demo.Model.Library;
import com.Library.demo.Service.LibraryService;

@RestController
public class LibraryController {

	@Autowired
	LibraryService ls;
	
	@GetMapping("/lib")
	public List<Library> details(){
		return ls.getDetails();
	}
	
	@PostMapping("/lib1")
	public String all(@RequestBody Library id) {
		ls.save(id);
		return "saved";
	}

	@PutMapping("/lib2")
	public String fun(@RequestBody Library id) {
		ls.update(id);
		return "updated";
	}
	
	@GetMapping("/lib3/{id}")
	public Optional<Library> fix(@PathVariable int id) {
	      return ls.find(id);
	   
	}
	
	@DeleteMapping("/lib3/{id}")
	public String tax(@PathVariable int id) {
	      ls.delete(id);
	      return "finded";
	}
	
	@GetMapping("/lib4/{field}")
	public List<Library> sortLibrary(@PathVariable String field){
		return ls.sortLibrary(field);
	}

	@GetMapping("/lib5/{offset}/{pageSize}")
	public List<Library> Library(@PathVariable int offset,@PathVariable int pageSize){
		return ls.pagingLibrary(offset,pageSize);
	}
	
	@GetMapping("/lib6/{offset}/{pageSize}")
	public Page<Library> liveLibrary(@PathVariable int offset,@PathVariable int pageSize){
		return ls.pageableLibrary(offset,pageSize);
	}
	
	@GetMapping("/lib7/{offset}/{pageSize}/{field}")
	public List<Library> Library(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field){
		return ls.pagingLibrary(offset,pageSize,field);
	}
	
	//localhost:8080/lib8?prefix=p
	@GetMapping("/lib8")
	public List<Library> fetchingTitle(@RequestParam String prefix){
		return ls.fetchTitle(prefix);
	}
	
	@GetMapping("/lib9/{suffix}")
	public List<Library> fetchedTitle(@PathVariable String suffix){
		return ls.fetchingTitle(suffix);
	}
	
	@GetMapping("/lib10/{author}")
	public List<Library> findAuthor(@PathVariable String author){
		return ls.fetchAuthor(author);
	}
	
	@GetMapping("/lib11/{author}/{title}")
	public List<Library> fillAuthor(@PathVariable String author,@PathVariable String title){
		return ls.setAuthor(author,title);
	}
	
	@GetMapping("/lib12/{author}")
	public List<Library> filledAuthor(@PathVariable String author){
		return ls.setByAuthor(author);
	}
	
	/*@GetMapping("/lib13/{author}")
	public int deletedAuthor(@PathVariable String author){
		ls.deleteByAuthor(author);
		return 5;
	}*/
}
