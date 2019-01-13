package com.example;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        intStack intStack = new intStack();

        //pushing elements into the stack
        intStack.push(10);
        intStack.push(3);
        intStack.push(72);
        intStack.push(91);
        intStack.push(12);
        intStack.push(38);

        //Displaying the Stack
        intStack.displayStack();

        //Peak the top element in the stack
        System.out.println(intStack.peek());

        //Searching the stack for a specific element
        System.out.println(intStack.searchStack(12));
        System.out.println(intStack.searchStack(100));

        //Poping an element from the stack
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());

        intStack.displayStack();

    }
}
