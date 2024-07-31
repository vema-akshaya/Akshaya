import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
        public static void main(String args[])
        {
            Map<MapExample, String> maps = new HashMap<>();

            maps.put(new MapExample("Akshaya","41864"),"java Developer");
            maps.put(new MapExample("Malavika","41863"),"qwerty");
            maps.put(new MapExample("Pravalleka","17129"),"qwerty1");
            maps.put(new MapExample("Mounika","41860"), "qwerty2");
            maps.put(new MapExample("Meghana","41866") ,"qwerty3");

            System.out.println(maps);

            MapExample mapExample = new MapExample("HELLO" , "123");
            MapExample mapExample1 = new MapExample("HELLO" , "123");
            if(mapExample.equals(mapExample1))
            {
                System.out.println("Both objects are equal");
            }

            if (mapExample.hashCode() == mapExample1.hashCode()) {
                System.out.println("Both objects have the same hash code");
            } else {
                System.out.println("Both objects have different hash codes");
            }
        }

    }


