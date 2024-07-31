//Example for Multiple objects referring to one static variable


public class Person {
    public static String name;
     public static void setName(String name){
         Person.name = name;
     }
     public static String getName(){
         return(name);
     }

    public static void main(String[] args) {
//        Person p = new Person();
//        p.setName("HA");
//        Person p1 = new Person();
//        System.out.println(p.getName());
//        System.out.println(p1.getName());

        Person.setName("AKSHAYA");
        System.out.println(Person.getName());
        System.out.println(Person.getName());
    }
}

