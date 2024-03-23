package com.salihpolat;

public class Manager extends Personnel {

    private ERole role;
    private double bonus;

    public Manager() {
        super();
    }

    public Manager(String name, String surname, int age, ERole role, double workingHour, double hourlyWage, double bonus) {
        super(name, surname, age, role, workingHour, hourlyWage);
        this.role = ERole.MANAGER;
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Manager works.");
    }

    @Override
    public double payroll() {
        double salary = getWorkingHour() * getHourlyWage();
        if (getHourlyWage() < 500) {
            setHourlyWage(500);
        }
        salary += bonus;
        System.out.println("Manager gets paid.");
        return salary;
    }

    public void manage() {
        System.out.println("Manager manages the team.");
    }

    public ERole getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", role='" + role + '\'' +
                '}';
    }
}
