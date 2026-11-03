package LinkedStackDemo;

public class Main {
    static void main() {
        LinkedStack<String> names = new LinkedStack<>();
        names.push("ali");
        names.push("hawa");
        names.push("osman");

        System.out.println("removed: " + names.pop());
        System.out.println("size: " + names.size());
        System.out.println("Empty: " + names.isEmpty());
        System.out.println("last element: " + names.peek());
    }
}
