package com.salihpolat;

public class Officer extends Personnel {

    private ERating rating;
    private ERole role;

    public Officer() {
        super();
    }

    public Officer(String name, String surname, int age, ERole role, double workingHour, double hourlyWage, ERating rating) {
        super(name, surname, age, role, workingHour, hourlyWage);
        this.role = ERole.OFFICER;
        this.rating = rating;
    }

    @Override
    public void work() {
        System.out.println("Officer works.");
    }

    @Override
    public double payroll() {
        if (rating == ERating.JUNIOR) {
            double salary = getWorkingHour() * getHourlyWage();
            if (getWorkingHour() > 180) {
                salary += (getWorkingHour() - 180) * getHourlyWage() * 1.5;
            }
            System.out.println("Officer gets paid.");
            return salary;
        } else if (rating == ERating.MID) {
            setHourlyWage(getHourlyWage() + 250);
            double salary = getWorkingHour() * getHourlyWage();
            if (getWorkingHour() > 180) {
                salary += (getWorkingHour() - 180) * getHourlyWage() * 1.5;
            }
            salary += 500;
            System.out.println("Officer gets paid.");
            return salary;
        } else {
            setHourlyWage(getHourlyWage() + 500);
            double salary = getWorkingHour() * getHourlyWage();
            if (getWorkingHour() > 180) {
                salary += (getWorkingHour() - 180) * getHourlyWage() * 1.5;
            }
            salary += 500;
            System.out.println("Officer gets paid.");
            return salary;
        }
    }

    public void manage() {
        System.out.println("Officer manages the team.");
    }

    public ERole getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", role='" + role + '\'' +
                '}';
    }
}
