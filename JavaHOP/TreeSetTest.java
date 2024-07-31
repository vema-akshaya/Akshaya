import java.util.Collections;
import java.util.TreeSet;
import java.util.Set;

public class TreeSetTest {
    public static void main(String args[])
    {
        Set<SetExample> names = new TreeSet<>(new SetIdComparator());
        names.add(new SetExample("Akshaya","41865"));
        names.add(new SetExample("Akshaya","41864"));
      //  names.add(new SetExample("Akshaya","41864"));
        names.add(new SetExample("Malavika","41863"));
        names.add(new SetExample("Pravalleka","17129"));
        names.add(new SetExample("Mounika","41860"));
        names.add(new SetExample("Meghana","41866"));

        System.out.println(names);

        //Collections.sort(names, new SetIdComparator());

    }

}
