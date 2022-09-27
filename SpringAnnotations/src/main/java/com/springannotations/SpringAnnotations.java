package com.springannotations;

import com.springannotations.beans.Books;
import com.springannotations.beans.Product;
import com.springannotations.beans.Student;
import com.springannotations.controller.HelloController;
import com.springannotations.dao.BookRepoImpl;
import com.springannotations.dao.IBookRepo;
import com.springannotations.service.BookServiceImpl;
import com.springannotations.service.IBookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.springannotations.*"})
public class SpringAnnotations {

    public static void main(String[] args) {

        ApplicationContext context =  new AnnotationConfigApplicationContext(SpringAnnotations.class);

  /*      Books books = context.getBean(Books.class);
        System.out.println(books);
        books.setBid(101);
        books.setBname("Panchratna");
        books.setBtype("Story");
        books.setBprice(1000);
        System.out.println(books.getBid()+" "+books.getBname()+" "+books.getBtype()+" "+books.getBprice());
*/

     /*   Books books1 = context.getBean(Books.class);
        System.out.println(books1);*/
 /*       books1.setBid(101);
        books1.setBname("Panchratna");
        books1.setBtype("Story");
        books1.setBprice(1000);
        System.out.println(books1.getBid()+" "+books1.getBname()+" "+books1.getBtype()+" "+books1.getBprice());

        Books books12 = context.getBean("books1",Books.class);
        System.out.println("prototype scope "+books12);
*/
        Books books3 = context.getBean("b3",Books.class);
        System.out.println("Books object using bean "+books3);


        System.out.println(books3.getPname());



        IBookService service = context.getBean(BookServiceImpl.class);
        System.out.println("Calling using @Service object"+ service);

        IBookRepo repo = context.getBean("repo1",BookRepoImpl.class);
        System.out.println("Calling using @Repository object"+repo    );

        HelloController helloController = context.getBean(HelloController.class);
        System.out.println("Controller object"+helloController);



        Student s1 = context.getBean("s1",Student.class);
        System.out.println("Student object created manually "+s1);

    }

    @Bean("s1")
    public Student getObject(){
        return new Student();
    }

    @Bean("b3")
    public Books getBooks(){
        return new Books(111,"Ramayan","myht",1200);
    }

    @Bean
    public Product getProd(){
        return new Product(12);
    }


}
