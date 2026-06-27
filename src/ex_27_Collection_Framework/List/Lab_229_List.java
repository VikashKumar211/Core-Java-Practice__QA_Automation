package ex_27_Collection_Framework.List;

import java.util.*;

public class Lab_229_List {
    public static void main(String[] args) {
        List list01 = new ArrayList(3);
        List list02 = new ArrayList();

        list01.add(1);
        list01.add(2);
        list01.add(3);
        list01.add(4);
        System.out.println(list01.size());

        list02.add(10);
        list02.add(20);
        list02.add(30);
        System.out.println(list02.size());

        System.out.println("____");
        for (int i = 0; i < list01.size(); i++){
            System.out.println(list01.get(i));
        }

        System.out.println("******");
        for(Object o:list02){
            System.out.println(o);
        }

    }
}
