package LinkedStackDemo;

public class LinkedStack<T> {
    private int count;
    private Node<T> head;  //top / front

    LinkedStack() {
        count = 0;
        head = null;
    }

    //operations
    //push
    public void push(T element) {
        Node<T> temp = new Node<>(element);
        temp.setNext(head);
        head = temp;
        count++;
    }

    //pop
    public T pop() {
        if (isEmpty()) {
            System.out.println("The stack is Empty!");
            return null;
        }
        T removedElement = head.getElement();
        head = head.getNext();
        count--;
        return removedElement;
    }

    //peek
    public T peek() {
        if (isEmpty()) {
            System.out.println("The stack is Empty!");
            return null;
        }
        return head.getElement();
    }

    //isEmpty
    public boolean isEmpty() {
//        return head == null;
        return count == 0;
    }

    //size
    public int size() {
        return count;
    }

    //Activity:->
    //display elements
    void displayElements() {
//   your code     ......
    }
}
