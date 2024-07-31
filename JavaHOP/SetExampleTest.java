import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetExampleTest  {

    public static void main(String args[])
    {
        Set<SetExample> names = new HashSet<>();
       // names.add(new SetExample("Akshaya","41865"));
        names.add(new SetExample("Akshaya","41864"));
        names.add(new SetExample("Malavika","41863"));
        names.add(new SetExample("Pravalleka","17129"));
        names.add(new SetExample("Mounika","41860"));
        names.add(new SetExample("Meghana","41866"));

//         String s1 = "Hello";
//         String s2 = "Hello";
//         if(s1.equals(s2)){
//             System.out.println("Both s1 and s2 ae equal");
//         }

        System.out.println(names);
            SetExample setExample = new SetExample("HELLO" , "123");
            SetExample setExample1 = new SetExample("HELLO" , "123");
            if(setExample.equals(setExample1))
            {
                System.out.println("Both objects are equal");
            }

    }

}

