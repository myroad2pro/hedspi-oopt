public class EqualsMethod3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1==s2);
        String s3 = new String ("Goodbye");
        String s4 = new String ("Goodbye");
        System.out.println(s3==s4);
        String name = "Joe";
        System.out.println("Joe".equals(name));
        System.out.println("Joe".equalsIgnoreCase("joE"));
    }
}