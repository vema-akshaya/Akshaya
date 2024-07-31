import java.util.Objects;

public class EncapsulationExample {
    String name;
    int age;

    EncapsulationExample(String name, int age){
        Objects.requireNonNull(name , "Name cannot be null");
        this.name = name;
        this.age = age;
    }
}
