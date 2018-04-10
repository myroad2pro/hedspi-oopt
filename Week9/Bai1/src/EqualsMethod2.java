class MyValue {
    int i;
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        MyValue v1 = new MyValue();
        MyValue v2 = new MyValue();
        v1.i = v2.i = 100;
        System.out.println(v1==v2);
        System.out.println(v1.equals(v2));      // false do MyValue chua dinh nghia method equals trong khai bao 
        // nen object mac dinh su dung method equals cua class Object va tra ve false
    }
}