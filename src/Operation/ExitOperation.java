package Operation;

import Book.BookList;

import java.util.Scanner;
//退出功能的实现
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) throws OperationException {
        System.out.println("whether to exit?"+"(Y/N)");
        Scanner scan=new Scanner(System.in);
        if(scan.next().equalsIgnoreCase("Y")){
            System.out.println("exit!");
            System.exit(0);
        }
    }
}
