package ex_27_Collection_Framework.SET;

import java.util.*;

public class Lab_240_Set {
    public static void main(String[] args) {
        Set hs = new HashSet<>();
        Set ts = new TreeSet();
        Set ls = new LinkedHashSet();

        hs.add("vikash");
        hs.add("akash");
        hs.add("vikash");
        hs.add(null );

        System.out.println(hs); //[null, akash, vikash]

        ts.add("vikash");
        ts.add("akash");
        ts.add("vikash");
     //   ts.add(null );
        System.out.println(ts); //[akash, vikash]

        ls.add("vikash");
        ls.add("akash");
        ls.add("vikash");
        ls.add(null );
        System.out.println(ls);//[vikash, akash, null]

        System.out.println("****");

        List newList = new ArrayList<>();
        newList.add(hs);
        newList.add(ts);
        newList.add(ls);
        System.out.println(newList);
    }
}
