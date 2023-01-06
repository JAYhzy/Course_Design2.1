package users;

import Book.BookList;
import Operation.*;

public class Reader extends User{
    public Reader(String name){
        super(name);
    }
    @Override
    public void menu() {
        System.out.println("dear:"+this.getName()+ "welcome to library");
        System.out.println("1.search");
        System.out.println("0.quit");
    }
    public void Operation(int n, BookList bookList)throws OperationException {
        IOperation iOperation = switch (n) {
            case 0 -> new ExitOperation();
            case 1 -> new FindOperation();
            default -> throw new OperationException("Input errors, please re-enter");
        };
        try {
            iOperation.work(bookList);
        }catch(OperationException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
