package com.example;

import java.util.EmptyStackException;

public class intStack {

    private int[] stack;
    private int size;
    private int top;

    //default constructor
    public intStack() {
        top = -1;
        size = 50;
        stack = new int[size];
    }

    //constructor with parameters. user can provide size of the stack
    public intStack(int size) {
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    //Push function pushes a value in the stack
    public String push(int item) {
        if (!isFull()) {
            stack[++top] = item;
            return "Pushing element: " + item;
        } else {
            return "Stack is full";
        }
    }

    // Pop function pops a value which is on the top of the stack
    public String pop() {
        if (!isEmpty())
            return "Poping Element: " + stack[top--];
        else
            throw new EmptyStackException();

    }


    //checks if the stack is full
    public boolean isFull() {
        return (top == stack.length - 1);
    }

    //check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    //check what is the value at the top of the stack
    public String peek() {
        if (!isEmpty())
            return ("Element at the Stack Top: " + stack[top]);
        else
            throw new EmptyStackException();
    }

    //print the entire stack
    public void displayStack() {

        if (!isEmpty()) {
            System.out.print("Current Stack [");
            for (int current = top; current > -1; current--) {
                System.out.print(stack[current] + ",");
            }
            System.out.println("]");
        } else
            System.out.println("Stack is Empty");
    }

    //searches for an element in the stack.
    public String searchStack(int item) {

        for (int current = 0; current < stack.length; current++) {
            if (stack[current] == item)
                return "Element " + item + " is present at position " + current;
        }
        return "Element "+item+" is not present in the stack";
    }

}
