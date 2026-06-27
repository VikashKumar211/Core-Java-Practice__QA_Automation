package ex_26_Generic;

import java.util.*;
public class Lab_GenericList {
    public static void main(String[] args) {
        List l1 = new ArrayList<>();
        l1.add(10);
        l1.add(10.67);
        l1.add('A');
        l1.add("Kumar");
        l1.add(true);

        System.out.println(l1);
    }
}
