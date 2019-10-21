package datastructure.hashtables;

import datastructure.Employee;

public class SimpleHashTable {
    private Employee[] hashTable;

    public SimpleHashTable() {
        hashTable = new Employee[10];
    }

    //example of a hash, very simple algorithm
    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        if (hashTable[hashedKey] != null) {
            System.out.println("Sorry, there's already an employee at this position " + hashedKey);
        } else {
            hashTable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashKey = hashKey(key);
        return hashTable[hashKey];
    }

    public void printHashTable() {
        for (Employee employee : hashTable) {
            System.out.println(employee);
        }
    }
}
