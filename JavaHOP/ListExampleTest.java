import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExampleTest {

        public static void main(String args[])
        {
        List<ListExample> employee = new ArrayList<>();
        employee.add(new ListExample("Akshaya","41864"));
        employee.add(new ListExample("Malavika","41863"));
        employee.add(new ListExample("Pravalleka","17129"));
        employee.add(new ListExample("Mounika","41860"));
        employee.add(new ListExample("Meghana","41866"));

        for(int i =0 ; i<employee.size();i++)
        {
            System.out.println(employee.get(i));
        }
        System.out.println(employee);
        //using comparator
        //Collections.sort(employee , new EmpIdComparator());
                // using comparale
                Collections.sort(employee);
        System.out.println(employee);
    }

}
