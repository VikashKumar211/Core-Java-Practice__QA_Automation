package ex_27_Collection_Framework.Map;

import java.util.*;
public class Lab246_Map_Real {
    public static void main(String[] args) {
        Map<String , Object> m1 = new HashMap<>();
        m1.put("id", "1");
        m1.put("id", "2");
        m1.put("id2", "3");
        m1.put("id3", null);
        m1.put(null, null);
        m1.put(null, "07");
        System.out.println(m1);

        Map<String , Object> m2 = new LinkedHashMap<>();
        m2.put("id", "1");
        m2.put("id", "2");
        m2.put("id2", "3");
        m2.put("id3", null);
        m2.put(null, null);
        m2.put(null, "07");
        System.out.println(m2);

        Map<String , Object> m3 = new TreeMap<>();
        m3.put("id", "1");
        m3.put("id", "2");
        m3.put("id2", "3");
        m3.put("i_d3", null);
       // m3.put(null, null);
       // m3.put(null, "07");
        System.out.println(m3);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");
        System.out.println(book_read_items);



    }
}
