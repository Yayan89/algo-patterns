package datastructure.hashtables;


import datastructure.Employee;

public class SimpleHashTable {
    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }

    //example of a hash, very simple algorithm
    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            /*
                if hashKey equal array length,
                then head back to 0 to check the remaining
                or else increment
             */
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            /*
                once it reaches (9 + 1) % 10 = 0
                if will go back to beginning of the array
                and stops at stopIndex
             */
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }

        if (occupied(hashedKey)) {
            System.out.println("already someone");
        } else {
            hashTable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if(hashedKey == -1) {
            return null;
        }
        return hashTable[hashedKey].getEmployee();
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].getKey().equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
            /*
                if hashKey equal array length,
                then head back to 0 to check the remaining
                or else increment
             */
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex
                && hashTable[hashedKey] != null
                && !hashTable[hashedKey].getKey().equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if(stopIndex == hashedKey) {
            return -1;
        } else {
            return hashedKey;
        }
    }

    public void printHashTable() {
        for(int i = 0; i < hashTable.length; i++) {
            if(hashTable[i] == null) {
                System.out.println("null");
            } else {
                System.out.println(hashTable[i].getEmployee());
            }
        }
    }

    private boolean occupied(int index) {
        return hashTable[index] != null;
    }
}
