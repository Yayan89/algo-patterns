package datastructure.doublelinkedlist;

import datastructure.Employee;

public class EmployeeDoubleLinkedList {
    //class field that will hold the data like a list
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    //pass by reference
    public void addToFront(Employee employee) {
        //objectNode that will contain data
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            node.setNextNode(head);
            head.setPreviousNode(node);
        }
        //assign field, will this be GC? after invoking this method?
        //node will be GC but head has a reference of node, so it has kept the data of node
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        //objectNode that will contain the data
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null) {
            head = node;
        } else {
            node.setPreviousNode(tail);
            tail.setNextNode(node);
        }

        //assign field, will this be GC? after invoking this method?
        //node will be GC but head has a reference of node, so it has kept the data of node
        tail = node;
        size++;
    }

    //need to create O(1)
    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {
        if(head == null) {
            return false;
        }

        EmployeeNode current = head;
        while(!current.getEmployee().equals(existingEmployee)) {
            current = current.getNextNode();
        }

        //once you get the right newNode
        EmployeeNode newNode = new EmployeeNode(newEmployee);
        newNode.setPreviousNode(current.getPreviousNode());
        newNode.setNextNode(current);

        EmployeeNode previousNode = current.getPreviousNode();
        previousNode.setNextNode(newNode);
        current.setPreviousNode(newNode);

        //if there is only 1 node
        if(head == current) {
            head = newNode;
        }

        size++;
        return true;
    }


    public void printAll () {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNextNode();
        }
        System.out.println("null");
    }

    public EmployeeNode removeFromFront () {
        if (head == null) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNextNode() == null) {
            tail = null;
        } else {
            head.getNextNode().setPreviousNode(null);
        }
        head = head.getNextNode();
        size--;
        removedNode.setNextNode(null);
        return removedNode;
    }

    public EmployeeNode removeFrontEnd () {
        if (tail == null) {
            return null;
        }

        EmployeeNode removeNode = tail;
        if (tail.getPreviousNode() == null) {
            head = null;
        } else {
            tail.getPreviousNode().setNextNode(null);
        }

        tail = tail.getPreviousNode();
        size--;
        removeNode.setPreviousNode(null);
        return removeNode;
    }

    public int getSize () {
        return size;
    }
}
