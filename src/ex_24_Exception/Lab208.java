package ex_24_Exception;

public class Lab208 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try{
            b = 10/0;
        }catch (ArithmeticException f){
            System.out.println(f.getMessage());

        }catch (Exception f){
            System.out.println(f.getMessage());
        }

       System.out.println(b);
    }
}
