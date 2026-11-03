package LinkedStackDemo;

public class Node<T> {
    // element - next
    private T element;
    private Node<T> next;  //object reference

   public Node(){
        element = null;
        next = null;
    }
   public Node(T element){
        this.element = element;
        next = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
