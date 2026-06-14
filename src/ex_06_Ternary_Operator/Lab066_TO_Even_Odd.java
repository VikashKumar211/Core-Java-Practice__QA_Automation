package ex_06_Ternary_Operator;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args){
        int a = 17;
        int b = a%2;
        String result = b==0? "even" :"odd";
        System.out.println(result);
    }
}
