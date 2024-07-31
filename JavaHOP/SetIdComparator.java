import java.util.Comparator;

public class SetIdComparator implements Comparator<SetExample> {

    @Override
    public int compare(SetExample o1, SetExample o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
