package ex_24_Exception;

public class Lab205 {
    public static void main(String[] args){
        int a = 0;
        int b = 10;
        int c = b/a;  //java.lang.ArithmeticException: / by zero
        System.out.println(c);

        String s1= null; // java.lang.NullPointerException: Cannot invoke "String.trim()" because "s1" is null
        s1.trim();
    }
}
