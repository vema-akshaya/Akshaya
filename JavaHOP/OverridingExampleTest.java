import java.io.IOException;


public class OverridingExampleTest extends OverridingExample{

    @Override
    protected Integer num() throws IOException {
        return 10;
    }
    public static void main(String[] args) throws IOException {
        OverridingExample ox = new OverridingExample();
        System.out.println(ox.num());
    }
}
