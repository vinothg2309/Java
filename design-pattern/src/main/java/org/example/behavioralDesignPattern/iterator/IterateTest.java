package org.example.behavioralDesignPattern.iterator;

import java.util.Arrays;
import java.util.List;

public class IterateTest {

    public static void main(String[] args) {
        EmployeeIterator employeeIterate = new EmployeeIterator();
        List<Employee> list = Arrays.asList(new Employee[]{new Employee("A", 12)
                , new Employee("B", 13)
                , new Employee("C", 14)});
        employeeIterate.setEmployees(list);

        while (employeeIterate.hasNext()){
            Employee employee = employeeIterate.next();
            System.out.println(employee);
        }
    }
}
