package ex_27_Collection_Framework.List;

import java.util.*;
public class Lab_234_ArrayList_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String > names = new ArrayList();

        String EnterInput = "Y";
        while (EnterInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the names");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();

            System.out.println("Want to name");
            EnterInput = scanner.next();

        }
        for (int i =  0 ; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        scanner.close();
    }

}
