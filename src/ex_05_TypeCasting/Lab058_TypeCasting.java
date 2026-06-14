package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
   //     byte c = a;  //java: incompatible types: possible lossy conversion from int to byte
        byte c = (byte) a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
