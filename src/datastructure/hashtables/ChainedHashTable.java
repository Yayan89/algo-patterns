package datastructure.hashtables;

import datastructure.Employee;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    @SuppressWarnings("unchecked")
    private LinkedList<StoredEmployee>[] hashtable = new LinkedList[10];

    public ChainedHashTable() {
        Arrays.fill(hashtable, new LinkedList<>());
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee;

        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            if(storedEmployee.getKey().equals(key)) {
                return storedEmployee.getEmployee();
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;

        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            if(storedEmployee.getKey().equals(key)) {
                break;
            }
        }

        if(storedEmployee == null) {
            return null;
        } else {
            hashtable[hashedKey].remove(storedEmployee);
            return storedEmployee.getEmployee();
        }
    }

    /**
     * hashKey must always be modulus by data size
     */
    private int hashKey(String key) {
//        return key.length() % hashtable.length;
        return Math.abs(key.hashCode()) % hashtable.length;
    }
}
