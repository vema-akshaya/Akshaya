import java.io.IOException;

public class ExceptionExampleTest {
    //handling exception through method signature
//    public static void main(String[] args) throws IOException {
//        ExceptionExample ex = new ExceptionExample();
//        ex.getException();
//    }

    //handling exception through try catch block
//    public static void main(String[] args)  throws IOException {
//        ExceptionExample ex = new ExceptionExample();
//        try {
//            ex.getException();
//        } catch (IOException e) {
//            throw new IOException(e);
//        }
//    }

    public static void getMessage(int a) throws ExceptionExample {
        if(a<0){
            throw new ExceptionExample("Number should be greater than 0");
        }
    }
    public static void main(String[] args) throws ExceptionExample {
        getMessage(-1);
    }

}
