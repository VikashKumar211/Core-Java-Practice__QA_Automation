package ex_27_Collection_Framework.List;

import java.util.*;

public class Lab_233_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList<Integer>();
        marks.add(87);
        marks.add(88);
        marks.add(52);
        marks.add(90);
        marks.add(54);

        System.out.println(marks);
        System.out.println("___");
        Collections.sort(marks);
        System.out.println(marks);
        System.out.println("*****");

        Collections.sort(marks, Collections.reverseOrder());
       // Collections.reverse(marks);
       System.out.println(marks);


        System.out.println(Collections.min(marks));


        System.out.println("Reverse order");
        Collections.reverse(marks);
        System.out.println(marks);

    }
}
