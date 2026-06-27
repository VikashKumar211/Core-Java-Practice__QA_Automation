package ex_27_Collection_Framework.List;

import  java.util.*;
public class Lab_237_AL_iteration {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("bread"); // 0
        list.add("milk");  // 1
        list.add("butter"); // 2
        list.add("paneer");  //3
        list.add("jam");  //4
        list.add("cheeze");  //5
        list.add(123);  //6
        list.add(true);  //7
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.toArray().length);

        System.out.println("*******");

        for (int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("*******");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------");

        for(Object o : list){
            System.out.println(o);
        }


    }
}
