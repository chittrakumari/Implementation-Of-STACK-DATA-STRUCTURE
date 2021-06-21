package StackImplementationUsingLinkedList;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class definition<E> implements StackADT<E> {
    private ArrayList<E> stack;
    public definition()
    {

        stack = new ArrayList<>();
    }
    public boolean push(E item){
        return stack.add(item);

    }

    public E pop(){
        if(stack.isEmpty()){
            throw new NoSuchElementException("Underflow");
        }
       return stack.remove(stack.size()-1);
    }


    public E peek(){
        if(stack.isEmpty()){
            throw new NoSuchElementException("Underflow");
        }
        return stack.get(stack.size()-1);
    }
public boolean isEmpty(){

        return stack.isEmpty();
}



    public void print(){

        System.out.println( "{"+
                    "stack=" + stack +
                    '}');
        }

}
