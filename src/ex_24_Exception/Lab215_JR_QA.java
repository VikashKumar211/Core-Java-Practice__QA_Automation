package ex_24_Exception;

public class Lab215_JR_QA {
    public static void main(String[] args) {
        String ip = null;// java.lang.ArrayIndexOutOfBoundsException
        try{
            ip = args[0];
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        int a = 0; // NumberFormatException
        try {
            a=Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("01 it will run");
        }

        int b = 0;
        try {
            b = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
