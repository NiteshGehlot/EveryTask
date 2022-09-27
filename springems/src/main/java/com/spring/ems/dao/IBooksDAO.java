package com.spring.ems.dao;

import com.spring.ems.beans.Books;

import java.util.List;

public interface IBooksDAO {

    public int addBooks(Books books);
    public int updateBooks(Books books);

    public int deleteBooksById(int bid);
    public Books selectBooksById(int bid);

    public List<Books> selectAllBooks();
}
