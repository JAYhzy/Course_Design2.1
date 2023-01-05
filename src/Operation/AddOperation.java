package Operation;

import Book.*;
import util.jdbc_util;

import java.sql.Connection;
import java.util.Scanner;
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) throws Exception {

        jdbc_util jdbcUtil = new jdbc_util();
        Connection connection =  jdbcUtil.getCon();

        System.out.println("Add book!");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the ISBN of the book you want to add:");
        int ISBN=scan.nextInt();
        System.out.println("Please enter the publisher:");
        String publisher=scan.next();
        System.out.println("Please enter the name of the book you want to add:");
        String name=scan.next();
        System.out.println("Please enter the page of the book:");
        int page=scan.nextInt();
        System.out.println("Please enter the published_time of book:");
        String published_time=scan.next();
        System.out.println("Please enter the authors:");
        String authors=scan.next();
        System.out.println("Please enter the category of the book you want to add:");
        String category=scan.next();
        Book book=new Book( ISBN,  publisher,  name,  page,  published_time,  authors,  category);
        BookDao bookDao = new BookDao();
        if (bookDao.addBook(connection, book))
            System.out.println("successfully!");
        else System.out.println("false");
    }
}
