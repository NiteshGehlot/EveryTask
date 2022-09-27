package com.spring.ems.ui;


import com.spring.ems.beans.Books;
import com.spring.ems.service.BooksServiceImp;
import com.spring.ems.service.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;



public class Client { // USER INTERFACE


    static Books book;

    public static void main(String[] args) {



        ApplicationContext context = new AnnotationConfigApplicationContext(MyCofig.class);

        IBooksService service = context.getBean(BooksServiceImp.class);
        System.out.println(context);
        System.out.println(service);


        book = (Books) context.getBean("books",Books.class);
        System.out.println(book);


        Scanner scanner = new Scanner(System.in);



        boolean flag = true;

        while (flag) {

            System.out.println("*******WELCOME TO Stationery MANAGEMENT SYSTEM*******");
            System.out.println("1. Add Books");
            System.out.println("2. Update Books");
            System.out.println("3. Delete Book By Id");
            System.out.println("4. Select Book By Id");
            System.out.println("5. Select All Books");
            System.out.println("6. Logout/Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    Books books = inputData();


                    boolean isValid =	BooksServiceImp.validateInputs(books);

                    if(isValid) {
                        int count = service.addBooks(books);

                        System.out.println(count + " record inserted successfully");
                    }
                    else {

                        System.err.println("Please Enter valid Inputs");

                    }
                    break;


                case 2:

                    Books books2 = inputData();

                    //update from DAO class

                    int updateCount =	service.updateBooks(books2);

                    System.out.println(updateCount+" record updated successfully");

                    break;

                case 3:

                    System.out.println("Enter Id to Delete One Record");
                    int deleteId =scanner.nextInt();

                    int deleteCount =	service.deleteBooksById(deleteId);

                    System.out.println(deleteCount+" record deleted successfully");

                    break;

                case 4:
                    System.out.println("Enter Id to Select One Record");
                    int searchId =scanner.nextInt();

                    Books books1 =	service.selectBooksById(searchId);


                    System.out.println(books1);

                    break;

                case 5:

                    // select all

                    List<Books> list =		service.selectAllBooks();

                    Stream<Books> stream =	list.stream();


                    //stream.forEach((Employee e1)-> {System.out.println(e1);});

                    stream.forEach(System.out::println);


                    break;



                case 6:

                    //System.exit(0);// killing JVM

                    System.out.println("Thank You , Logout Success");

                    flag = false;

                    break;

                default:
                    break;
            }

        }

    }

    public static Books inputData() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Bid");
        int bid = scanner.nextInt();
        System.out.println("Enter Bname");
        String bname = scanner.next();
        System.out.println("Enter Bprice");
        double bprice = scanner.nextDouble();
        System.out.println("Enter Btype");
        String btype = scanner.next();


        book.setBid(bid);
        book.setBname(bname);
        book.setBprice(bprice);
        book.setBtype(btype);

        return book;

    }







}

