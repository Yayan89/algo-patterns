package datastructure.linkedlist;

import datastructure.Employee;

public class EmployeeNode {
    private Employee employee;
    //this is to hold the next node, you need this to create a list of next things
    private EmployeeNode nextNode;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(EmployeeNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return  "employee=" + employee.toString();
    }
}
