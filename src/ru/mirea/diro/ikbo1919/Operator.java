package ru.mirea.diro.ikbo1919;

public class Operator implements EmployeePosition{
    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }

    @Override
    public String toString() {
        return this.getJobTitle();
    }
}
