package day64;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(15);

        System.out.println(q1);

        q1.poll();
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);

        Queue<String > q2 = new PriorityQueue<>();
        q2.add("Erhan");
        q2.add("Madina");
        q2.add("Mahriban");
        q2.add("Alla");

        System.out.println(q2);

        q2.poll();
        System.out.println(q2);
        q2.poll();
        System.out.println(q2);
        q2.poll();
        System.out.println(q2);


        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addFirst(10);
        d1.addFirst(20);
        d1.addFirst(30);

        System.out.println(d1);

    }
}
