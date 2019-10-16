package datastructure.linkedlist;

import datastructure.Employee;

public class EmployeeLinkedList {
    //class field that will hold the data like a list
    private EmployeeNode head;
    private int size;

    //pass by reference
    public void addToFront(Employee employee) {
        //objectNode that will contain data
        EmployeeNode node = new EmployeeNode(employee);
        node.setNextNode(head);
        //assign field, will this be GC? after invoking this method?
        //node will be GC but head has a reference of node, so it has kept the data of node
        head = node;
        size++;
    }

    public void printAll() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            System.out.println(" -> ");
            current = current.getNextNode();
        }
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty()) return null;
        EmployeeNode removedNode = head;
        head = head.getNextNode();
        size--;
        return removedNode;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}
