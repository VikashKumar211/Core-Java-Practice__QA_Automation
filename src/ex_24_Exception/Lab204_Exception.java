package ex_24_Exception;

public class Lab204_Exception {
    public static void main(String[] args) {
        String s1 = args[0];
        Integer ab = Integer.parseInt(s1);
        int b = 10;
        int c = b/ab;  //java.lang.ArithmeticException: / by zero
        System.out.println(c);

    }
}
