package StackImplementationUsingDequeInterface;

import java.util.*;

public class ReversingALinkedListUsingStack {
    public static void main(String[] args) {

        Deque<Integer> stack= new ArrayDeque<Integer>();
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(Math.abs(new Random().nextInt()%100));
        }


        for (Integer integer : list) {
            stack.push(integer);
        }

        //Method~1 to reverse a Linked List
        System.out.println("old list"+list);
        for (int i = 0; i <10 ; i++) {
            System.out.println(stack.pop());
        }


        //Method~2 to reverse a Linked List
        int index=0;
        while(!list.isEmpty()){
            stack.push(list.get(index));
            list.remove(index);
            index ++;
        }
        System.out.println(stack);
        List<Integer> list1=new java.util.ArrayList<>(List.of(45,23,19));

    }
}
