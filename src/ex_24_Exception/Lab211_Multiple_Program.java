package ex_24_Exception;

public class Lab211_Multiple_Program {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        String s1 = null;
        try {
            s1.trim();
            b = 10/0;
        }catch (NullPointerException n){
            System.out.println(n.getMessage());
           // System.out.println(s1.trim());
        }catch (ArithmeticException f){
            System.out.println(f.getMessage());
            System.out.println(b = 10/0);
        }
    }
}
