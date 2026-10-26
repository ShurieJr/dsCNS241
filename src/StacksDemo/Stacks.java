package StacksDemo;

import java.util.Stack;

public class Stacks {
    static void main() {
        Stack<String> commands = new Stack<>();
        commands.push("ipconfig");
        commands.push("ping 192.168.1.2");

        System.out.println(commands);
        System.out.println("Number of Commands: " + commands.size());
        System.out.println("last command: " + commands.peek());
        System.out.println("isEmpty: " + commands.isEmpty());

        System.out.println("undo : " + commands.pop());
//        System.out.println("undo : " + commands.pop());
       System.out.println("isEmpty: " + commands.isEmpty());
        System.out.println("Number of Commands: " + commands.size());



        System.out.println(commands.search("ipconfig"));

    }
}
