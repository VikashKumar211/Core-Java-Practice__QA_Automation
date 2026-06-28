package ex_27_Collection_Framework.Queue;

import java.util.*;
public class LabLinkedAsQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.println(q1);

        Iterator<Integer> iterator = q1.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }

    }
}
