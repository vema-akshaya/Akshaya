import java.util.Objects;
public class MapExample {
        String name;
        String id;
        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }
        public  MapExample(String name,String id){
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

        MapExample maps = (MapExample) o;
        return id == maps.id && Objects.equals(name,  maps.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

}


