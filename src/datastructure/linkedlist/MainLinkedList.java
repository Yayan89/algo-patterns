package datastructure.linkedlist;

import datastructure.Employee;

public class MainLinkedList {

    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", 123);
        Employee employee2 = new Employee("Mike", "Harry", 4567);
        Employee employee1 = new Employee("Gandalf", "THe Great", 9823);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(employee);
        list.addToFront(employee1);
        list.addToFront(employee2);

        list.printAll();

        System.out.println(list.getSize());
    }
}

