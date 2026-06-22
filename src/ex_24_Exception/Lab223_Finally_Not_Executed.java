package ex_24_Exception;

public class Lab223_Finally_Not_Executed {
    public static void main(String[] args) {
        int a = 10;

        try {
            System.out.println("middle exit");
            System.exit(0);
            a= 10/0;
            System.out.println(a);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Always run");
        }
    }
}
