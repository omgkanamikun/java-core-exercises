package com.bobocode;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<Integer>queue = new LinkedQueue<>();
        queue.add(123);
        queue.add(124);
        queue.add(125);
        queue.add(126);
        queue.add(127);
        System.out.println(queue.size());
        System.out.println(queue.pull());
    }
}
