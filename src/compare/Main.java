package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Denesh", "Kaur", 35);
        Employee employee2 = new Employee("Alphredic", "Asus", 20);
        Employee employee3 = new Employee("Cedric", "Java", 50);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        Collections.sort(employeeList);
        System.out.println(employeeList);
    }
}
