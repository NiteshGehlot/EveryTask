package com.spring.ems.service;

import com.spring.ems.beans.Books;
import com.spring.ems.dao.IBooksDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImp implements IBooksService {

    @Autowired
    IBooksDAO dao;
    @Override
    public int addBooks(Books books) {
        return dao.addBooks(books);
    }

    @Override
    public int updateBooks(Books books) {
        return dao.updateBooks(books);
    }

    @Override
    public int deleteBooksById(int bid) {
        return dao.deleteBooksById(bid);
    }

    @Override
    public Books selectBooksById(int bid) {
        return dao.selectBooksById(bid);
    }

    @Override
    public List<Books> selectAllBooks() {
        return dao.selectAllBooks();
    }

    public static boolean validateInputs(Books books) {

        boolean isValid = false;

        if (books.getBid() > 99 && books.getBname().length() > 3 && books.getBprice() > 1000 ) {

            isValid = true;
        }

        return isValid;
    }
}
