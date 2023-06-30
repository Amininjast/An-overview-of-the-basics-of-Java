package com.amininjast.datastructures;

import java.util.Stack;

public class TheStack {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push("Amin");
        System.out.println(stack.peek());
        System.out.println("the stack size is : " + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("the stack size is : " + stack.size());
    }
}
