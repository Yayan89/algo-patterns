package datastructure.hashtables;

import datastructure.Employee;

public class MainSimpleHash {
    public static void main(String[] args) {
        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("test0", new Employee("young", "naive", 18));
        hashTable.put("test01", new Employee("test1", "HK", 120));
        hashTable.put("test002", new Employee("test2", "HK", 11));
        hashTable.put("test0003", new Employee("test3", "HK", 12));
        hashTable.put("test00004", new Employee("test4", "HK", 12));
        hashTable.put("test1", new Employee("test5", "HK", 12));

        hashTable.remove("test002");
        hashTable.remove("test0003");

        System.out.println(hashTable.get("test0003"));
    }
}
