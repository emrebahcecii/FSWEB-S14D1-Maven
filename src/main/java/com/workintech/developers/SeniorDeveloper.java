package com.workintech.developers;

public class SeniorDeveloper extends com.workintech.developers.Employee {


    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior developer is system architecture.");
        setSalary(getSalary() + 3000);
    }
}