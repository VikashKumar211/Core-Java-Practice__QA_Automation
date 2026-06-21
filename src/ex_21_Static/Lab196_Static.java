package ex_21_Static;

public class Lab196_Static {
    public static void main(String[] args) {
        automation a1 = new automation();
      //  System.out.println(a1.driver);
        System.out.println(a1.driver2);
        automation.driver = "edge";
        System.out.println(a1.driver);
        automation.driver2 = "firefox";
        System.out.println(a1.driver2);


    }
}
class automation{
    static String driver = "chrome";

    static String driver2;
}