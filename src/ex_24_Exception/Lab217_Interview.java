package ex_24_Exception;

public class Lab217_Interview {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a =0;
        try {
            a = 10/0;
        }catch (Exception e){
            System.out.println("Divided by zero");
        }finally {
            System.out.println("It will execute in any condition");
        }
    }
}
