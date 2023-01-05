//package Operation;
//
//import Book.BookList;
//
//import java.util.Scanner;
////归还操作
//public class ReturnOperation implements IOperation{
//    @Override
//    public void work(BookList bookList) throws Exception {
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the book you want to return:");
//        String name=scan.next();
//        boolean flag=true;
//        for(int i=0;i<bookList.getBooks().size();i++){
//            if(bookList.getBooks().get(i).getName().equals(name)){
//                flag=false;
//                System.out.println("successfully!");
//                bookList.getBooks().get(i).setBorrowed(false);
//            }
//        }
//        if(flag){
//            throw new OperationException("could not find it!");
//        }
//    }
//}
