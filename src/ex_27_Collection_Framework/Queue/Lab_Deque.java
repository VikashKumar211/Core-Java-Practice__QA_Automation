package ex_27_Collection_Framework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab_Deque {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(5);
        q.push(6);
        q.push(7);
        q.push(8);
        System.out.println(q);
        System.out.println(q.pop());
        System.out.println(q.peek());
    }
}
