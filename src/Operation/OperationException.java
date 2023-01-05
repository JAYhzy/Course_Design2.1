package Operation;

public class OperationException extends Exception{
    static final long serialVersionUID=-33875169931L;
    //空参构造器
    public OperationException(){

    }
    public OperationException(String message){
        super(message);
    }
}
