import java.util.Comparator;

public class MapIdComparator implements Comparator<MapExample> {

    @Override
    public int compare(MapExample o1, MapExample o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

