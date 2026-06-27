package ex_26_Generic;

public class Lab_224 {
    public static void main(String[] args) {
        sum(3,5);
        sum("vikash", "kkumar");
        System.out.println(sum("vikash", "kkumar"));
        System.out.println(sum(3, 4));

    }
    static Integer sum(Integer a, Integer b){
        return a+b;
    }
    static Double sum(Double a, Double b){
        return  a+b;
    }

    static Float sum(Float a, Float b){
        return a+b;
    }
    static String sum(String a, String b){
        return a+b;
    }
}
