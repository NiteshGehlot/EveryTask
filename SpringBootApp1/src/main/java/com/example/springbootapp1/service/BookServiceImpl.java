package com.example.springbootapp1.service;

import com.example.springbootapp1.repo.IBookdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService{

    @Autowired
    IBookdao bookdao;




    @Override
    public void getBooks() {

        System.out.println("Book Service");
        System.out.println(bookdao);
        bookdao.getBook();





    }
}
