import java.io.IOException;

public class ExceptionExample extends Exception {

 //throwing an exception
//     public void getException() throws IOException{
//        throw new IOException();
//    }
//custom exception
    public ExceptionExample(String msg){
        super(msg);
    }
}
