package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args){
        int fee = 100;
        float GST = 18.45f;
        int total =  fee + (int )GST; // narrowing
        System.out.println(total);

        float total1 = fee + GST;  // widening
        System.out.println(total1);
    }
}
