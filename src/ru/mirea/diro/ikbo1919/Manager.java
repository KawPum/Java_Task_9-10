package ru.mirea.diro.ikbo1919;

public class Manager implements EmployeePosition{
    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + 0.05 * 1000 * ((Math.random()*25)+115);
    }

    @Override
    public String toString() {
        return this.getJobTitle();
    }
}
