package StackExample;


public class StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");

        System.out.println("the thing the top: " + stack.peek());


        stack.pop(); // "you"

        System.out.println("the thing the top: " + stack.peek());


    }
}
