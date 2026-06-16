package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the num");
        int num= scan.nextInt(); ;
        int factor = 1;
        int i= 1;
        while(i<=num){
             factor = factor*i;

            i++;

        }
        System.out.printf("factor of n %d is %d" , num,factor);
    }
}
