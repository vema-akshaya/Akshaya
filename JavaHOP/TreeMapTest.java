import java.util.TreeMap;
import java.util.Map;

public class TreeMapTest {
    public static void main(String args[])
    {
        Map<MapExample, String> tmaps = new TreeMap<>( new MapIdComparator());

        tmaps.put(new MapExample("Akshaya","41864"),"java Developer");
        tmaps.put(new MapExample("Malavika","41863"),"qwerty");
        tmaps.put(new MapExample("Pravalleka","17129"),"qwerty1");
        tmaps.put(new MapExample("Mounika","41860"), "qwerty2");
        tmaps.put(new MapExample("Meghana","41866") ,"qwerty3");

        System.out.println(tmaps);
        for(MapExample key : tmaps.keySet()){
            System.out.println("Keys : " + key);
        }
        for(String value : tmaps.values()){
            System.out.println("Values : " + value);
        }

    }

}


