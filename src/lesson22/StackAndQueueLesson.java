package lesson22;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueLesson {
    public static void main(String[] args) {
        Stack<String> myStringStack = new Stack<>();

        myStringStack.push("Oxana.");
        myStringStack.push(" is ");
        myStringStack.push("name");
        myStringStack.push(" My ");
        myStringStack.push("Hello!");

        int stackSize = myStringStack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.print(myStringStack.pop());
        }

        System.out.println();

        Queue<String> myStringQueue = new LinkedList<>();

        myStringQueue.add("It");
        myStringQueue.add(" is ");
        myStringQueue.add("a");
        myStringQueue.add(" wonderful ");
        myStringQueue.add("day!");

        int myQueueLength = myStringQueue.size();
        for (int i = 0; i < myQueueLength; i++) {
            System.out.print(myStringQueue.remove());
        }

        System.out.println();
        String stringToTest = "M .. - om";

        stringToTest = stringToTest.replaceAll("[^a-zA-Z0-9]", "");
        if (isPalindrome(stringToTest)){
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }

    static boolean isPalindrome(String possiblePalindrome) {
        Stack<String> myStack = new Stack<>();
        int halfTheLength = possiblePalindrome.length() / 2;

        for (int i = 0; i < halfTheLength; i++) {
            myStack.push(Character.toString(possiblePalindrome.charAt(i)));
        }
        if (possiblePalindrome.length() % 2 != 0) {
            halfTheLength++;
        }

        for (int i = halfTheLength; i < possiblePalindrome.length(); i++) {
            if (!Character.toString(possiblePalindrome.charAt(i)).equalsIgnoreCase(myStack.pop())) {
                return false;
            }
        }
        return true;
    }
}