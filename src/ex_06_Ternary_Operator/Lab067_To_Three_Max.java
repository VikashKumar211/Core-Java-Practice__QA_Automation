package ex_06_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args){
        int a = 110, b = 52, c =20;

        String result = a>b ? ( a>c?"a id max":"c is max"): (b>c?"b is max":"c is max");
        System.out.println(result);



    }
}
