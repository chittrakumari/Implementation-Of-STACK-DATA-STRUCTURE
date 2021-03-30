package StackImplementationUsingLinkedList;

public interface StackADT<E> {

    //to add a element in the stack
    public boolean push(E item);

    //to delete a element in the stack
    public E pop();


    //fetches the value at the top of the stack without deleting it.
    public E peek();

    //to print the stack
    public void print();

    public boolean isEmpty();

}

