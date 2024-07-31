import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {
    public static void main(String[] args) {



        List<Integer> numbers  = Arrays.asList(1,2,3,4,5,6);


        //external iterator
        for(Integer number : numbers){
            System.out.println(number);
        }

        //internal iterator using lamda
        numbers.forEach(number -> System.out.println(number));

        numbers.forEach(System.out::println);

        //converting list numbers elements to strings and cllect the elements into a list
        List<String>  numberStrings = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(numberStrings);

        //filtering the elements  which are greater than 5
        List<Integer>  numberStringsfilter = numbers.stream()
                .filter(x -> x > 5)
             // .map(String::valueOf)  if at all we are trying to filtering we may face type cast issues for that we use it
                .collect(Collectors.toList());
        System.out.println(numberStringsfilter);


        //converting string to integers
        List<Integer> numberIntegers = numberStrings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(numberIntegers);

    }
}
