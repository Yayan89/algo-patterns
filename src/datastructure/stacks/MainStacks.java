package datastructure.stacks;

import datastructure.Employee;

public class MainStacks {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        Employee employee = new Employee("John", "Doe", 123);
        Employee employee1 = new Employee("Gandalf", "THe Great", 9823);
        Employee employee2 = new Employee("Mike", "Harry", 4567);
        stack.push(employee);
        stack.push(employee1);
        stack.push(employee2);

        stack.printStack();
    }
}
