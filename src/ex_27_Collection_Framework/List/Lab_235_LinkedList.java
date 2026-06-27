package ex_27_Collection_Framework.List;

import java.util.LinkedList;
import java.util.*;

public class Lab_235_LinkedList {
    public static void main(String[] args) {
        List l1 = new LinkedList();
        l1.add(1);
        l1.add("vikasj");
        l1.add("vikasj");
        l1.add(1);
        l1.add(null);
        System.out.println(l1);
        System.out.println("****");

        for (Object o :l1){
            System.out.println(o);
        }

        System.out.println("____");

        Iterator iterator = l1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
