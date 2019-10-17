package datastructure.stacks;

import datastructure.Employee;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        //this can be O(n)
        if(top == stack.length) {
            //to resize the array since its full
            stack = Arrays.copyOf(stack, 2 * stack.length);
        }

        //this part is O(1)
        stack[top++] = employee;
    }

    public Employee pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top -1];
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for(int i = top -1; i >= 0; i--) {
            System.out.println(stack[i]);;
        }
    }

    public boolean isEmpty() {
        return top ==0;
    }
}
