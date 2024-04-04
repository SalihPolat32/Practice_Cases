package com.salihpolat;

public abstract class Personnel {

    private String name;
    private String surname;
    private int age;
    private ERole role;
    private double workingHour;
    private double hourlyWage = 500;

    public Personnel() {
    }

    public Personnel(String name, String surname, int age, ERole role, double workingHour, double hourlyWage) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.role = role;
        this.workingHour = workingHour;
        this.hourlyWage = hourlyWage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ERole getRole() {
        return role;
    }

    public void setRole(ERole role) {
        this.role = role;
    }

    public double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(double workingHour) {
        this.workingHour = workingHour;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public abstract void work();

    public abstract double payroll();

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
