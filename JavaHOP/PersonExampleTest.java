//import java.util.ArrayList;
//import java.util.List;
//
//public class PersonExampleTest {
//
//    public static void main(String[] args) {
//    List<PersonExample> persons = loadpersons();
//
//
//    }
//
//
//    private  static List<PersonExample> loadpersons()
//    {
//        List<PersonExample> personList = new ArrayList<>();
//        personList.add("Akshaya",21,"Associate Engineer");
//
//        return personList;
//    }
//}
//
//


import java.util.*;
import java.util.stream.Collectors;

public class PersonExampleTest {
    public static void main(String[] args) {
        List<PersonExample> persons = loadPersons();
        List<PersonExample> per = persons.stream()
                //.filter(person -> person.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println(per);
        PersonExample foundPerson = persons.stream()
                .filter(person -> person.getName() .startsWith("Ma"))
                .findFirst()
                .orElse(null)
                ;
        PersonExample per1 = persons.stream()
                .filter(person -> person.getName() .startsWith("Ma"))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No person found with a name starting with 'ma'"));
        ;
        System.out.println(foundPerson);

        System.out.println(per1);

        Map<String, PersonExample> personMap=per.stream()
                .collect(Collectors.toMap(PersonExample::getName,person->person));
        System.out.println(personMap);
//Before Java8
        Map<String,List<PersonExample>> designation=new HashMap<>();
        for(PersonExample person:persons)
        {
            List<PersonExample> personList=null;
            if(designation.containsKey(person.getDesignation()))
            {
                personList=designation.get(person.getDesignation());
            }
            else{
                personList=new ArrayList<>();
                designation.put(person.getDesignation(),personList);
            }
            personList.add(person);
        }
        System.out.println(designation);
        //Java 8
        List<PersonExample> p=loadPersons();
        Map<String, List<PersonExample>> result =p.stream()
                .collect(Collectors.groupingBy(PersonExample::getDesignation));
        System.out.println(result);
    }


    private static List<PersonExample> loadPersons(){
        List<PersonExample> personlist=new ArrayList<>();
        personlist.add(new PersonExample("akshaya",20,"SE"));
        personlist.add(new PersonExample("vema",19,"Java Developer"));
        personlist.add(new PersonExample("Mounika",15,"ASE"));
        personlist.add(new PersonExample("meghana",21,"SSE"));
        return personlist;

    }
}