import java.util.Comparator;

public class ListExample implements Comparable<ListExample> {

    String name;
    String id;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ListExample(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(ListExample l) {
        return this.id.compareTo(l.getId());
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }
}