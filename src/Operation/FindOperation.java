package Operation;

import Book.Book;
import Book.BookDao;
import Book.BookList;
import util.jdbc_util;

import java.sql.Array;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;
//查找功能的实现
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) throws Exception {
        jdbc_util jdbcUtil = new jdbc_util();
        Connection connection =  jdbcUtil.getCon();
        BookDao bookDao = new BookDao();

        System.out.println("Please input what information you want to query:");
        System.out.println("1.ISBN");
        System.out.println("2.Publisher");
        System.out.println("3.name");
        System.out.println("4.Authors");
        System.out.println("5.Category");
        Scanner scan=new Scanner(System.in);
        int po=scan.nextInt();
        switch (po) {
            case 1 -> {
                System.out.println("Enter ISBN:");
            }
            case 2 -> {
                System.out.println("Enter Publisher:");
            }
            case 3 -> {
                System.out.println("Enter book name:");
            }
            case 4 -> {
                System.out.println("Enter Authors:");
            }
            case 5 -> {
                System.out.println("Enter Category:");
            }
        }
        bookList.books = bookDao.findBook(connection, po-1, scan.next());
        if (bookList.books != null && bookList.books.size()!=0)
            for (Book e: bookList.books)
                System.out.println(e);
        else
            System.out.println("Not Found!");

    }
}
