import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(50);
        numbers.add(20);
        //external iterator
        for(int i = 0;i<numbers.size();i++)
        {
            System.out.println(numbers.get(i));
        }
        //for each loop
        for(int e : numbers){
            System.out.println(e);
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
