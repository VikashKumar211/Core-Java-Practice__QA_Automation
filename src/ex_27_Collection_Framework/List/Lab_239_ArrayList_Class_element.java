package ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.*;

public class Lab_239_ArrayList_Class_element {
    public static void main(String[] args) {
        student s1 = new student("vikash", "001");
        student s2 = new student("kumar", "002");
        student s3 = new student("vikash", "002");

        s1.printDetails();

        List student_details = new ArrayList<>();
        student_details.add(s1);
        student_details.add(s2);
        student_details.add(s3);
        System.out.println(student_details);

        Iterator iterator = student_details.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}


