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
        System.out.println("2.borrow");
        System.out.println("3.return");
        System.out.println("0.quit");
    }
    public void Operation(int n, BookList bookList)throws OperationException {
        IOperation iOperation=null;
        switch(n){
            case 0:
                iOperation= new ExitOperation();
                break;
            case 1:
                iOperation=new FindOperation();
                break;
            case 2:
                //iOperation=new BorrowOperation();
                break;
            case 3:
                //iOperation=new ReturnOperation();
                break;
            default:
                throw new OperationException("Input errors, please re-enter");
        }
        try {
            iOperation.work(bookList);
        }catch(OperationException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
