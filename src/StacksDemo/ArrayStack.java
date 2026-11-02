package StacksDemo;

import java.util.Arrays;

public class ArrayStack<T> {
    private final static int CAPACITY = 2;
    private int top;
    private T[] stack;

    ArrayStack(int initialSize) {
        top = 0;
        stack = (T[]) new Object[initialSize];
    }

    ArrayStack() {
        this(CAPACITY);
    }

    //operations
    //push
    public void push(T element) {
        if(size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }
    //expand capacity
    private void expandCapacity(){
        stack = Arrays.copyOf(stack , stack.length*2);
    }
    //pop
    public T pop(){
        if(isEmpty()){
            System.out.println("The stack is Empty!");
            return null;
        }
        top--;
        T removedElement = stack[top];
        stack[top] = null;
        return removedElement;
    }
    //peek
    public T peek(){
        if(isEmpty()){
            System.out.println("The stack is Empty!");
            return null;
        }
        return stack[top-1];
    }
    //isempty
    public boolean isEmpty() {
        return top == 0;
    }

    //size
    public int size() {
        return top;
    }

    //toString

   public void displayElements(){
        for(int i=0; i< size(); i++){
            System.out.println(stack[i]);
        }
//        for (T item : stack){
//            if(item != null)
//              System.out.println(item);
//        }
   }
}
