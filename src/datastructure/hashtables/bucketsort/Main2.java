package datastructure.hashtables.bucketsort;

import datastructure.Employee;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList<>();
        list.add(new Employee("Jane", "Jones", 123));
        list.add(new Employee("Doe", "Schwartz", 111));
        list.add(new Employee("Dear", "Jane", 999));
        list.add(new Employee("Dear", "Jane", 999));
        list.add(new Employee("Jane", "Jones", 123));

        HashMap<Integer, Employee> hashMap = new HashMap<>();
//        Iterator<Employee> iterator = list.iterator();
        LinkedList<Employee> remove = new LinkedList<>();

//        while(iterator.hasNext()) {
//            Employee next = iterator.next();
//
//            if(hashMap.containsKey(next.getId())) {
//                remove.add(next);
//            } else {
//                hashMap.put(next.getId(), next);
//            }
//        }

        //second way
        int bound = list.size();
        for (int i = 0; i < bound; i++) {
            Employee currentEmp = list.get(i);
            if (hashMap.containsValue(currentEmp)) {
                remove.add(currentEmp);
            } else {
                hashMap.put(i, currentEmp);
            }
        }

        remove.forEach(list::remove);
        System.out.println(list);
    }
}
