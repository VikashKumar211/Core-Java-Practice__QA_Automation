package ex_27_Collection_Framework.List;

import java.util.*;

public class Lab_232_Nested_ArrayList {
    public static void main(String[] args) {
        List fruit1 = new ArrayList<String>();
        fruit1.add("apple");
        fruit1.add("mango");
        fruit1.add("guava");

        List fruit2 = new ArrayList<String>();
        fruit2.add("oranges");
        fruit2.add("berry");
        fruit2.add("melon");

        List vegetable = new ArrayList<String>();
        vegetable.add("potato");
        vegetable.add("totamto");
        vegetable.add("onion");

        System.out.println(fruit1);
        System.out.println(fruit2);
        System.out.println(vegetable);

        System.out.println("******");
        List kitchen = new ArrayList<String>();
        kitchen.add(fruit1);
        kitchen.add(fruit2);
        kitchen.add(vegetable);

        System.out.println(kitchen);
        System.out.println(kitchen.size());

        System.out.println("*****");
        Iterator iterator = kitchen.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----");
        for (int i = 0 ; i< kitchen.size(); i++){
            System.out.println(kitchen.get(i));
        }



    }
}
