package datastructure.arraylist;

import datastructure.Employee;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Doe", 123));
        employees.add(new Employee("Mike", "Harry", 4567));
        employees.add(new Employee("Gandalf", "THe Great", 9823));

        employees.forEach(System.out::println);

        /*
               We need to keep this all the time. I am tech lead!
               等你等你
         */
    }

    private void doNothing() {
        return;
    }

    private void moreOfDoNothing() {
        return;
    }
}
