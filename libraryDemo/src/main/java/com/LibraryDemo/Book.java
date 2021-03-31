package com.LibraryDemo;

import javax.persistence.*;

//import org.hibernate.validator.constraints.ISBN;




@Entity
public class Book {
	
	
	private Long id_book;
	private String name_book;
	private String author;
	private String publisher;
	private String isbn;
	
	
	public Book () {
		
	}
	
	public Book(Long id_book, String name_book, String author, String publisher, String isbn) {
		super();
		this.id_book = id_book;
		this.name_book = name_book;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId_book() {
		return id_book;
	}
	public void setId_book(Long id_book) {
		this.id_book = id_book;
	}
	public String getName_book() {
		return name_book;
	}
	public void setName_book(String name_book) {
		this.name_book = name_book;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

}

