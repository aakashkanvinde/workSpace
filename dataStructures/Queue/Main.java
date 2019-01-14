package com.example;

public class Main {

    public static void main(String[] args) {
        // write your code here

        intQueue queue = new intQueue();

        // Enqueue elements into the queue
        queue.enqueue(3);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(72);
        queue.enqueue(88);
        queue.enqueue(100);

        //Displaying the Queue
        queue.displayAll();

        //Peak the top element in the queue
        System.out.println(queue.peek());

        //Deque an element from the stack
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.displayAll();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
    }
}
