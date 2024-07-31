import java.util.Comparator;
import java.util.List;

public class EmpIdComparator implements Comparator<ListExample> {

    @Override
    public int compare(ListExample o1, ListExample o2) {
        return  o1.getId().compareTo(o2.getId());
    }
}

