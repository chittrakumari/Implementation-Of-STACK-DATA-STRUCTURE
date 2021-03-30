package StackImplementationUsingLinkedList;

import java.util.Random;

public class Main extends definition<Integer>{
    public static void main(String[] args) {
        definition<Integer> myStack = new definition<>();

        for (int i = 0; i < 10; i++) {
            myStack.push(Math.abs(new Random().nextInt() % 100));
        }

        myStack.print();
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
    }

