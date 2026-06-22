package ex_24_Exception;

public class Lab212_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{
            b = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will run");
        }

    }
}
