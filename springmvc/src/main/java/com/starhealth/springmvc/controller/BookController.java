package com.starhealth.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starhealth.springmvc.entity.Book;
import com.starhealth.springmvc.service.IBookService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	IBookService service;


	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String add(Book book) {

		System.out.println(book);
		
		int count  = service.addBook(book);

		return  count+ " Record Added Successfully";

	}

	
	@RequestMapping("/getall")
	public  String getAllBooks(HttpSession session) {
		
		
	List<Book>  list =	service.selectAllBooks();
		
		System.out.println(list);
		
		session.setAttribute("Books ", list);
		
		return "success";
	}
	
	
	
}
