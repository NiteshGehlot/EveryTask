package com.starhealth.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starhealth.springmvc.entity.Book;
import com.starhealth.springmvc.repository.IBookDAO;
@Service
public class BookServiceImp implements IBookService {

	@Autowired
	IBookDAO dao ;
	
	
	@Override
	public int addBook(Book book) {
		
		return  dao.addBook(book);
	}

	

	@Override
	public List<Book> selectAllBooks() {
		
		return dao.selectAllBooks();
	}

	
	
	
	
	
	
}
