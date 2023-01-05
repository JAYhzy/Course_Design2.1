//Problem 1.
//        There is a small library with hundreds of various types of books. For any book, it has own the following properties:
//        1. ISBN
//        2. Publisher
//        3. Name
//        4. Page
//        5. Published time
//        6. Authors
//        7. Category
//        Please write a Java program to store all books in a list and achieve the following functions:
//        1. Get all properties of a book by its ISBN
//        2. Get all books by at least authors
//        3. Get all books by a category
//        4. Get all books by a publisher
//        5. Get all books by a name

import Book.BookList;
import Operation.IOperation;
import Operation.OperationException;
import users.Admin;
import users.Reader;
import users.User;

import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        System.out.println("Enter your identity.");
        System.out.println("administrator(0) or user(1)");
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        System.out.println("Enter your name:");
        User user=null;
        BookList bookList=new BookList();
        switch(choice){ //进行身份的选择
            case 0:
                user=new Admin(scan.next());
                break;
            case 1:
                user=new Reader(scan.next());
        }
        IOperation iOperation=null;
        do {
            user.menu();
            System.out.println("Enter your operation:");
            int input=scan.nextInt();
            if(input==0){
                System.out.println("exist");
                return;
            }
            try {
                user.Operation(input, bookList);
            }catch(OperationException e){
                System.out.println(e.getMessage());
            }
        }while(true);
    }
}
