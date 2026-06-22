package ex_24_Exception;

public class Lab216_EC {
    public static void main(String[] args) {
        try {
            String ip = args[3]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a;
            System.out.println(a);
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
