package ex_08_If_Condition;

import java.util.Scanner;


public class Lab082_If_Else_Scanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();

        if(age >= 18){
            System.out.println("you can vote");
        }else {
            System.out.println("you cann't vote");
        }



    }
}
