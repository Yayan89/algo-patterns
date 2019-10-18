package datastructure.queues;

import datastructure.Employee;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front, back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (back == queue.length) {
            queue = Arrays.copyOf(queue, queue.length * 2);
        }

        queue[back] = employee;
        back++;
    }

    public Employee remove() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;

        //reset queue
        if(size() == 0) {
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek() {
        if(size() ==0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printAll() {
        for(int i = 0; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
