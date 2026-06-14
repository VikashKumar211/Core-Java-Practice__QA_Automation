package ex_04_operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        int a = 10;
        String s1 = "hello";
        String s2 = "vikash";

        int b = 20;
        boolean married = false;
        System.out.println(a+b);  //30
        System.out.println(s1+s2);//hellovikash
        System.out.println(s1+s2+married); //hellovikashfalse
        System.out.println(a+b+s1+s2+married);  //30hellovikashfalse
        System.out.println(s1+s2+a+b+married);  //hellovikash1020false
        System.out.println(s1+s2+(a+b)+married);  //hellovikash30false

    }

}
