package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args){
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        String user_input = args[3];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        int age = Integer.parseInt(user_input);

        String result = age >=18 ? (age>=65?"senior":"adult"): "minor";
        System.out.println(result);

    }
}
