package org.example.behavioralDesignPattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeIterator implements Iterate<Employee>{

    List<Employee> employees;
    int currentIndex = 0;

    public EmployeeIterator() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void setEmployees(List<Employee> employees){
        this.employees.addAll(employees);
    }

    @Override
    public boolean hasNext() {
        if(currentIndex < employees.size())
            return true;
        return false;
    }

    @Override
    public Employee next() {
        if(currentIndex < employees.size()){
            Employee employee = this.employees.get(currentIndex);
            currentIndex++;
            return employee;
        }
        return null;
    }
}
