package datastructure.queues;

import datastructure.Employee;

public class MainQueue {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", 123);
        Employee employee2 = new Employee("Mike", "Harry", 4567);
        Employee employee3 = new Employee("Gandalf", "THe Great", 9823);
        Employee employee4 = new Employee("Rose", "Lam", 987);
        Employee employee5 = new Employee("Java", "Why not us", 1);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(employee);
        queue.add(employee2);
        queue.add(employee3);
        queue.add(employee4);
        queue.add(employee5);
        queue.printAll();
    }
}
