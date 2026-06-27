package ex_27_Collection_Framework.List;

import java.util.*;

import static javax.swing.UIManager.get;

public class Lab_228_ArrayList {
    public static void main(String[] args) {
        List l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add("3");
        l1.add(true);
        l1.add("kumar");

        System.out.println(l1.add("nothing"));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        System.out.println(l1.contains(true));
        System.out.println(l1.lastIndexOf(true));
        System.out.println(l1.indexOf("kumar"));
        System.out.println(l1);

        System.out.println("----------");


        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
        System.out.println("-------");

        for(Object o: l1){
            System.out.println(o);
        }

        System.out.println("*****");

        Iterator iterator = l1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
