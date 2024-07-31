public class StringExample {
    static String s1 = "Hello";
    static String s2 = "Hello";
    String name ;
    public void setName(String name){
        this.name = name;
    }

//    public StringExample(String str) {
//
//          }

    public static void main(String[] args) {
        StringExample str = new StringExample();
        str.setName("");
        System.out.println(s1.equals(str.name));

//        StringExample s3 = new StringExample("Hello");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
    }
}
