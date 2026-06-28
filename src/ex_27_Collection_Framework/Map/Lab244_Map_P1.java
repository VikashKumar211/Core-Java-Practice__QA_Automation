package ex_27_Collection_Framework.Map;

import java.util.*;
public class Lab244_Map_P1 {
    public static void main(String[] args) {

        List m1 = new LinkedList();
        m1.add("a1");
        m1.add("a2");
        m1.add("a3");
        m1.add("a4");
        System.out.println(m1);


        System.out.println();
        System.out.println("----HashMap----");
        Map map1 = new HashMap();
        map1.put("name", "vikash");
        map1.put("age" , "26");
        map1.put("phone" ,"97788");
        System.out.println(map1);


        System.out.println();
        System.out.println("---LinkedHashMap---");

        Map map2 = new LinkedHashMap();
        map2.put("name", "akash");
        map2.put("age" , "26");
        map2.put("phone" ,"11111");
        System.out.println(map2);


        System.out.println();
        System.out.println("---TreeMap---");
        Map map3 = new TreeMap();
        map3.put("name", "aman");
        map3.put("age" , "30");
        map3.put("phone" ,"222222");
        System.out.println(map3);

        List l=new ArrayList<>();
        l.add(m1);
        l.add(map1);
        l.add(map2);
        l.add(map3);

        System.out.println();

       // System.out.println(l);

        Iterator iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
