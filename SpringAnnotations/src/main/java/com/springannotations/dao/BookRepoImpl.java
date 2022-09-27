package com.springannotations.dao;

import com.springannotations.beans.Books;
import com.springannotations.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("repo1")
public class BookRepoImpl implements IBookRepo{

    @Autowired
    Student student;



    @Override
    public void getRepo() {

        System.out.println("getRepo is called");
        System.out.println("student object is called "+student);
    }
}
