package ex_05_TypeCasting;

public class Lab060_TypeCasting_PhoneNo {
    public static void main(String[] args){
        long phone_no = 6745916524l;
        System.out.println(phone_no);

        short s = (short) phone_no;
        System.out.println(s); //-31636  -> lose of data



    }
}
