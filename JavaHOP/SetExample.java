import java.util.Objects;
import java.util.Set;


public class SetExample {

    String name;
    String id;
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    public  SetExample(String name,String id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetExample employee = (SetExample) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}


