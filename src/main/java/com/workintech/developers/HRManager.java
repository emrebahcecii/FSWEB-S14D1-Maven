package com.workintech.developers;

public class HRManager extends Employee {

    JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[3];
    MidDeveloper[] midDevelopers = new MidDeveloper[3];
    SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[3];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is working...");
        setSalary(getSalary() + 5000);
    }

    public void addEmployee(JuniorDeveloper developer) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = developer;
                System.out.println("Junior added.");
                return;
            }
        }
        System.out.println("Junior list is full!");
    }

    public void addEmployee(MidDeveloper developer) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = developer;
                System.out.println("Mid added.");
                return;
            }
        }
        System.out.println("Mid list is full!");
    }

    public void addEmployee(SeniorDeveloper developer) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = developer;
                System.out.println("Senior added.");
                return;
            }
        }
        System.out.println("Senior list is full!");
    }
}
