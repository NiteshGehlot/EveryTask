package com.starhealth.springmvc.repository;

import java.util.List;

import com.starhealth.springmvc.entity.Book;

public interface IBookDAO {
	
	
	
	public int addBook(Book book);
	
	
	public List<Book> selectAllBooks();
	
	

}
