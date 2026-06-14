package ex_04_operators;

public class Lab042_Interview_Concat_Plus {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        String s1 = "vikash";
        String s2 = "Kumar";
        System.out.println(a+s1);  //10vikash
        System.out.println(s2+a+s1);  //Kumar10vikash
        System.out.println(s2+a+b+s1);  //Kumar1020vikash
        System.out.println(a+b);  //Kumar1020vikash

    }
}
