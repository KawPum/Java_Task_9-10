package ru.mirea.diro.ikbo1919;

public class Manager implements EmployeePosition{
    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return Math.ceil((baseSalary + 0.05 * 1000 * ((Math.random()*25)+115))/100)*100;
    }

    @Override
    public String toString() {
        return this.getJobTitle();
    }
}
