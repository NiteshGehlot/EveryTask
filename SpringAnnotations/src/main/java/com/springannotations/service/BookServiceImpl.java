package com.springannotations.service;

import com.springannotations.dao.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    IBookRepo repo;


    @Override
    public void callService() {

        System.out.println("Service method called");
        System.out.println("service getting using repo name "+repo);
    }
}
