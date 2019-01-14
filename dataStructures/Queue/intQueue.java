package com.example;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class intQueue {

    private int[] queue;
    private int size;
    private int total;
    private int front;
    private int rear;

    //default constructor
    public intQueue() {
        size = 100;
        total = 0;
        front = 0;
        rear = 0;
        queue = new int[size];
    }

    //constructor with arguments
    public intQueue(int size) {
        this.size = size;
        total = 0;
        front = 0;
        rear = 0;
        queue = new int[this.size];
    }

    // Puts an element in the queue
    public boolean enqueue(int item) {
        if (!isFull()) {
            total++;
            queue[rear] = item;
            rear = (rear + 1) % size;
            return true;
        } else {
            return false;
        }
    }

    // Removes an element out of the queue
    public String dequeue() {
        if (!isEmpty()) {
            int item = queue[front];
            total--;
            front = (front + 1) % size;
            return "Removing Element: " + item;
        }else
            throw new EmptyStackException();

    }

    // Prints the entire queue
    public void displayAll() {
        int front1 = front;
        if (!isEmpty()) {
            System.out.print("[");
            for (int current = 0; current < total; current++) {
                System.out.print(" " + queue[front1] + ",");
                front1 = (front1 + 1) % size;
            }
            System.out.println("]");
        }
    }

    // checks if the queue is full
    public boolean isFull() {
        if (size == total)
            return true;
        else
            return false;
    }

    // checks if the queue is empty
    public boolean isEmpty() {
        if (total == 0)
            return true;
        else
            return false;
    }

    // check the element at the front of the queue
    public String peek() {
        if (!isEmpty())
            return ("Element at the front of the Queue: " + queue[front]);
        else
            throw new NoSuchElementException();
    }

}
