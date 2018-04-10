class MyValue{
    int i;
    // tham so cua equals thuoc lop Object nen khi viet lai can ep kieu cho phu hop
    public boolean equals(Object obj){
        return (this.i == ((MyValue)obj).i);
    }
}

public class EqualsMethod4{
    public static void main(String args[]){
        MyValue v1 = new MyValue();
        MyValue v2 = new MyValue();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));      // true
        System.out.println(v1==v2);     // false
    }
}