package ex_27_Collection_Framework.List;

import java.util.*;

public class Lab_238_Stack {
    public static void main(String[] args){
        Stack s1 = new Stack();

        s1.add(1);
        s1.add(2);
        s1.add(3);
        System.out.println(s1);

        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.push("Amit2");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.add("vikash");
        System.out.println(s);
        s.push("kum");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());


        System.out.println(s.get(0));
        System.out.println(s.get(1));
//
//
//        List list = new ArrayList();
//        list.add(s1);
//        list.add(s);
//        System.out.println(list);

    }
}
