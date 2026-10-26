package StacksDemo;

import java.util.Scanner;
import java.util.Stack;

public class ReverseText {
    static void main() {
        Scanner input = new Scanner(System.in);
        Stack<Character> chars = new Stack<>();

        System.out.println("Enter text:");
        String text = input.nextLine();

        //step 1 : push characters into a stack
        for(int i=0; i < text.length(); i++){
            chars.push(text.charAt(i));
        }

        //step 2 : pop characters from the stack
        StringBuilder reversedText = new StringBuilder();
        int size = chars.size();

        for(int j = 0 ; j < size;  j++){
            reversedText.append(chars.pop());
        }

        System.out.println("Original Text : " + text);
        System.out.println("reversed Text : " + reversedText);
    }
}
