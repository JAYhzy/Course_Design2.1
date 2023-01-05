//package Operation;
//
//import Book.BookList;
//
//import java.util.Scanner;
//public class BorrowOperation implements IOperation{
//    @Override
//    public void work(BookList bookList)throws OperationException{
//        System.out.println("Please enter the book you want to borrow:");
//        Scanner scan=new Scanner(System.in);
//        String name=scan.next();
//        boolean flag=true;
//        for(int i=0;i< bookList.getBooks().size();i++){
//            if(bookList.getBooks().get(i).getName().equals(name)){ //查找到该书籍在图书馆中
//                flag=false;
//                if(bookList.getBooks().get(i).isBorrowed()==true){
//                    throw new OperationException("the book has been lent");
//                }else{ //书未被借出
//                    System.out.println("successfully!");
//                    bookList.getBooks().get(i).setBorrowed(true);
//                }
//            }
//        }
//        //出循环了，仍未找到
//        if(flag) {
//            throw new OperationException("could not find it");
//        }
//    }
//}
