package ex_27_Collection_Framework.List;

import java.util.*;
public class Lab_227_List {
    public static void main(String[] args) {
       // List fruits = List.of("vikash", 124, 34.34, 'a',true, null,"kumar");
        List fruits = List.of("vikash", 124, 34.34, 'a',true,"kumar");
        //Key Point: List.of() is ideal for creating fixed, read-only lists,
        // whereas ArrayList should be used when you need a modifiable list or need to store null values.
        System.out.println(fruits);

        System.out.println("----------");

        List newlist = new ArrayList<>();
     //   List newlist = new ArrayList<>("vikash", 124, 34.34, 'a',true, null,"kumar");
        newlist.add("vikash");
        newlist.add(123);
        newlist.add(32.123);
        newlist.add('a');
        newlist.add(true);
        newlist.add(null);

        System.out.println(newlist);

    }
}
