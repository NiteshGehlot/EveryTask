package com.example.springbootapp1;

import com.example.springbootapp1.beans.Books;
import com.example.springbootapp1.service.BookServiceImpl;
import com.example.springbootapp1.service.IBookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootApp1Application {

    @Bean
    public Books getBooksObj(){
        return new Books();
    }



    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootApp1Application.class, args);

        IBookService service = context.getBean(BookServiceImpl.class);

        System.out.println(service);
        service.getBooks();
    }

}
