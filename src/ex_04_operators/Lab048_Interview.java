package ex_04_operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int age = 25 ;
        boolean a = !(age>20 || age<20 );
        // a = !(T || F)
        System.out.println(a);//false
    }
}
