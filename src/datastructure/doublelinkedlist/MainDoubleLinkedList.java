package datastructure.doublelinkedlist;

import datastructure.Employee;

public class MainDoubleLinkedList {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", 123);
        Employee employee1 = new Employee("Gandalf", "THe Great", 9823);
        Employee employee2 = new Employee("Mike", "Harry", 4567);
        Employee employee3 = new Employee("Thierry", "Cong", 5555);
        Employee employee4 = new Employee("End", "End", 1111);

        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
        list.addToFront(employee);
        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.printAll();

        list.addToEnd(employee4);
        list.printAll();

        //testcase for addBefore()
        Employee employee5 = new Employee("Doughnut", "Horton", 100);
        list.addBefore(employee5, employee2);
        list.printAll();

        EmployeeDoubleLinkedList list1 = new EmployeeDoubleLinkedList();
        list1.addBefore(employee5, employee2);
        list1.printAll();


    }
}
