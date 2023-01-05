package Book;

import Operation.ExitOperation;
import Operation.FindOperation;
import Operation.OperationException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    /**
     * 创建表
     * @param conn
     * @throws Exception
     */
    public void createTable(Connection conn) throws Exception {
        String sql = """
                CREATE TABLE  if NOT exists `book` (
                \t`id` INT NOT NULL AUTO_INCREMENT,
                \t`ISBN` INT NULL,
                \t`Publisher` VARCHAR(50) NULL,
                \t`Name` VARCHAR(50) NULL,
                \t`Page` INT NULL,
                \t`Published_time` CHAR(50) NULL,
                \t`Authors` VARCHAR(50) NULL,
                \t`Category` VARCHAR(50) NULL,
                \tINDEX `id` (`id`)
                )
                COLLATE='utf8mb3_general_ci'
                ;""";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        if (preparedStatement.executeUpdate() > 0) {
            System.out.println("successfully!");
        }

        //释放资源
        preparedStatement.close();
    }

    public boolean addBook(Connection connection, Book book) throws SQLException {
        //language=MariaDB
        String sql = "insert into book values(null, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, book.getISBN());
        preparedStatement.setString(2, book.getPublisher());
        preparedStatement.setString(3, book.getName());
        preparedStatement.setInt(4, book.getPage());
        preparedStatement.setString(5, book.getPublished_time());
        preparedStatement.setString(6, book.getAuthors());
        preparedStatement.setString(7, book.getCategory());

        int n = preparedStatement.executeUpdate();
        return n == 1;
    }

    public ArrayList<Book> DisplayBook(Connection connection) throws SQLException{
        String sql = "select * from book";
        ArrayList<Book> books=new ArrayList<Book>();
        //获取pstmt对象
        PreparedStatement pstm =  connection.prepareStatement(sql);
        //执行sql
        ResultSet rs =pstm.executeQuery();
        //获取数据
        while (rs.next()) {
            int ISBN =rs.getInt("ISBN");
            int Page = rs.getInt("Page");
            String Publisher = rs.getString("Publisher");
            String Name = rs.getString("Name");
            String Published_time = rs.getString("Publisher_time");
            String Authors = rs.getString("Authors");
            String Category = rs.getString("Category");
            books.add(new Book(ISBN,Publisher, Name, Page, Published_time, Authors, Category));
        }
        rs.close();
        pstm.close();
        return books;
        }

    public ArrayList<Book> findBook(Connection connection,int po, String string) throws SQLException{
        ArrayList<Book> books=new ArrayList<Book>();
        PreparedStatement pstm =  null;

        switch(po){
            case 0:
                String sql0 = "select * from book where ISBN = ?";
                pstm = connection.prepareStatement(sql0);
                break;
            case 1:
                String sql1 = "select * from book where Publisher = ?";
                pstm = connection.prepareStatement(sql1);
                break;
            case 2:
                String sql2 = "select * from book where Name= ?";
                pstm = connection.prepareStatement(sql2);
                break;
            case 3:
                String sql3 = "select * from book where Authors= ?";
                pstm = connection.prepareStatement(sql3);
                break;
            case 4:
                String sql4 = "select * from book where Category= ?";
                pstm = connection.prepareStatement(sql4);
                break;
            default:return null;
        }
        if (po ==   0)
            pstm.setInt(1, Integer.parseInt(string));
        else
            pstm.setString(1, string);
        ResultSet rs =pstm.executeQuery();
        //获取数据
        while (rs.next()) {
            int ISBN =rs.getInt("ISBN");
            int Page = rs.getInt("Page");
            String Publisher = rs.getString("Publisher");
            String Name = rs.getString("Name");
            String Published_time = rs.getString("Publisher_time");
            String Authors = rs.getString("Authors");
            String Category = rs.getString("Category");
            books.add(new Book(ISBN,Publisher, Name, Page, Published_time, Authors, Category));
        }
        rs.close();
        pstm.close();
        return books;
    }
}




