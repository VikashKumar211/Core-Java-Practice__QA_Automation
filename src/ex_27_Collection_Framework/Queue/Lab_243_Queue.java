package ex_27_Collection_Framework.Queue;

import java.util.*;
public class Lab_243_Queue {
    public static void main(String[] args) {
        PriorityQueue pq1 = new PriorityQueue();

        pq1.add("Vikash");
        pq1.add("kumar");
        pq1.add("Vikash02");
        System.out.println(pq1);

        System.out.println(pq1.peek());
        System.out.println(pq1.poll());

    }
}
