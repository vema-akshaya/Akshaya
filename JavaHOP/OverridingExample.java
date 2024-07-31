import java.io.IOException;

public class OverridingExample {
    protected Number num() throws IOException {
        System.out.println("Number method");
        return null;
    }
}
