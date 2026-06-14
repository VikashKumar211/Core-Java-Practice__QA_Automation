package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args){
        //no drink":"in Goa you can drink"): "can not go to goa
        //age > 18 --- can go to goa
        //age > 25 -- you can drink
        int age = 25;

        String result = age>=18 ? (age>=25? " GOA and drink":"GOA but no drink"): "can not go to goa";
        System.out.println(result);

    }
}
