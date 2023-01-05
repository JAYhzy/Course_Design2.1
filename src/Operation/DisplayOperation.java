package Operation;

import Book.Book;
import Book.BookDao;
import Book.BookList;
import util.jdbc_util;

import java.sql.Connection;

public class DisplayOperation implements IOperation{
    //显示功能的实现
    @Override
    public void work(BookList bookList) throws Exception {
        jdbc_util jdbcUtil = new jdbc_util();
        Connection connection =  jdbcUtil.getCon();
        BookDao dao = new BookDao();
        bookList.books = dao.DisplayBook(connection);
        for(int i=0;i<bookList.getBooks().size();i++){
            System.out.println(bookList.getBooks().get(i)); //直接输出
        }
    }
}
