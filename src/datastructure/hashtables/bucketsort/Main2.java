package datastructure.hashtables.bucketsort;

import datastructure.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList<>();
        list.add(new Employee("Jane", "Jones", 123));
        list.add(new Employee("Doe", "Schwartz", 111));
        list.add(new Employee("Dear", "Jane", 999));
        list.add(new Employee("Jane", "Jones", 123));

        list.forEach(System.out::println);
    }
}
