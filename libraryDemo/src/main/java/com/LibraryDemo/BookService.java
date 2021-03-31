package com.LibraryDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookrepo;
	
	public List<Book>listAll(){
		return bookrepo.findAll();
	}

	public void save(Book book) {
	  bookrepo.save(book);
	}
	
	public Book get(Long id) {
		return bookrepo.findById(id).get();
	}
	
	public void delete(Long id) {
		bookrepo.deleteById(id);
	}
}
