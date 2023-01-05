package users;

import Book.BookList;
import Operation.OperationException;

public abstract class User {
    private String name;
    public User(String name){
        this.name=name;
    }
    public User(){
    }

    public abstract void menu();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public abstract void Operation(int n, BookList bookList)throws OperationException;
}
