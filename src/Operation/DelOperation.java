//package Operation;
//import Book.BookList;
//
//import java.util.Scanner;
//public class DelOperation implements IOperation{
//    @Override
//    public void work(BookList bookList)throws OperationException{
//        System.out.println("Please enter the book you want to delete:");
//        Scanner scan=new Scanner(System.in);
//        String Name=scan.next();
//        boolean flag=true;
//        for(int i=0;i< bookList.getBooks().size();i++){
//            if(bookList.getBooks().get(i).getName().equals(Name)){
//                flag=false;
//                System.out.println("find it，delete or not:"+Name+"(Y/N)");
//                if(scan.next().equalsIgnoreCase("y")){ //进行删除操作
//                    bookList.getBooks().remove(i);
//                    System.out.println("Successfully deleted!");
//                }
//            }
//        }
//        if(flag){
//            throw new OperationException("could not find it!");
//        }
//    }
//}
