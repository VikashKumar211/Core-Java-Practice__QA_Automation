package ex_26_Generic;

public class Lab_225_Generic_data_type {
    public static void main(String[] args) {
        sum1(3, 4);
        sum1(3.56, 4.567);
        sum1("Vikash", "Kumar");


    }

//    static Integer sum1(Integer a, Integer b){
//    return a+b;
//    }
    static <T> T sum1(T a, T b){
        return null;
    }
}
