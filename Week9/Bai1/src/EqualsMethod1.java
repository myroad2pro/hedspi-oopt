public class EqualsMethod1 {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);       // false vi hai object khac nhau
        System.out.println(n1 != n2);       // true
        System.out.println(n1.equals(n2));  // true gia tri cua hai object bang nhau
    }
}