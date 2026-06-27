package ex_27_Collection_Framework.SET;

import java.util.*;
public class Lab_242_SET_TS_HS {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet();
        set.add(1);
        set.add(345);
        set.add(3);
        set.add(642);
        System.out.println(set);

        Set<Integer> set01 = new HashSet();
        set01.add(1);
        set01.add(345);
        set01.add(3);
        set01.add(642);
        System.out.println(set01);

        Set<Integer> set02 = new LinkedHashSet();
        set02.add(1);
        set02.add(345);
        set02.add(3);
        set02.add(642);
        System.out.println(set02);

        List set_all = new ArrayList();
        set_all.add(set);
        set_all.add(set01);
        set_all.add(set02);
        System.out.println(set_all);

        System.out.println("------");
        Iterator iterator = set_all.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
