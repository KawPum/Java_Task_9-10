package ru.mirea.diro.ikbo1919;

public class Employee {
    private String surname;
    private String name;
    private double salary;
    private EmployeePosition position;

    public Employee(String surname, String name, double salary, EmployeePosition position) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return this.position.calcSalary(this.salary);
    }

    public EmployeePosition getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return surname + " " + name + ", " + this.getSalary() + ", " + position;
    }
}
