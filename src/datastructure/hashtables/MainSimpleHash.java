package datastructure.hashtables;

import datastructure.Employee;

public class MainSimpleHash {
    public static void main(String[] args) {
        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("test", new Employee("young", "naive", 18));
        hashTable.put("boub", new Employee("test", "HK", 120));
        hashTable.printHashTable();
    }
}
