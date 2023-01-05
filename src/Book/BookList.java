package Book;

import java.util.ArrayList;

public class BookList {
    public ArrayList<Book> books=new ArrayList<Book>();
    public BookList() {}
    public Book getBook(int pos){
        return books.get(pos);
    }
    public void setBook(int pos,Book book){
        books.set(pos,book);
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
}
