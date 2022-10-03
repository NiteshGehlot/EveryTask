package com.starhealth.springmvc.service;

import java.util.List;

import com.starhealth.springmvc.entity.Book;

public interface IBookService {
	
	
	
	public int addBook(Book book); //post
	
	
	public List<Book> selectAllBooks(); //get
	
	

}
