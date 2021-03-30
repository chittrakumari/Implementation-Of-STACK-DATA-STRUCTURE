//Implementation of Stack Using Deque Interface.



package StackImplementationUsingDequeInterface;

import java.util.ArrayDeque;
import java.util.Deque; //(pronounced as "DECK"------>Deque---->Double Ended Queue.
import java.util.Random;

public class StackDemo {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(23);
        for (int i = 0; i <10; i++) {
            stack.add(Math.abs(Math.abs(new Random().nextInt() % 100)));
        }
        System.out.println("Original Stack"+stack);
        System.out.println("Last Element of the stack"+stack.peek());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
