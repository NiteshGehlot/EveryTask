package com.example.springbootapp1.repo;

import com.example.springbootapp1.beans.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements IBookdao{

    @Autowired
    Books book;


    @Override
    public void getBook() {

        book.setBid(101);
        book.setBname("Panchtantra");
        book.setBtype("Story");
        book.setBprice(1000);

        System.out.println("Books in repo "+book);
        System.out.println("Book repo back end logics");

    }
}
