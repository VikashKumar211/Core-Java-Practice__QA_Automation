package ex_24_Exception;

import java.util.Scanner;

public class Lab213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int b = scanner.nextInt();
            int a = 10/b;
            System.out.println(a);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            System.out.println("it will run");
        }


    }
}
