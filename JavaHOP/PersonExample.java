import java.util.Objects;
public class PersonExample {
    private final String name;
    private final int age;
     private final String designation;

    public String getDestination() {
        return designation;
    }


    public PersonExample(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }


    public String getName() {
        return name;
    }
    public String getDesignation() {
        return designation;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", destination='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonExample p = (PersonExample) o;
        return age == p.age && Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
