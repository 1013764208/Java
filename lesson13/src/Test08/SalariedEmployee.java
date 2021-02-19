package Test08;

import java.util.Calendar;

public class SalariedEmployee extends Employee{

    private int monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int earning() {
        return monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString() +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
