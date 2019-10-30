package datastructure.hashtables;

import datastructure.Employee;

public class StoredEmployee {
    private Employee employee;
    private String key;

    public StoredEmployee(String key, Employee employee) {
        this.employee = employee;
        this.key = key;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
