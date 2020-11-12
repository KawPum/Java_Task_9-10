package ru.mirea.diro.ikbo1919;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Company company = new Company(10000000, null);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        String[] surnames = {"Wong","Graham","Kennedy","Birkin","Mason","Galvin","Sunderland","Valentine","Nivans","Gillespi","Chambers","Wesker","Burton","Ozwell"};
        String[] names = {"Leon","Claire","Ada","Sherry","Chris","Jill","Carlos","Jake","Albert","Rebecca","Piers","Dahlia","Heather","Cheryl","Harry",
        "Spencer","Barry","Eileen","James","Ashley"};
        Scanner sc = new Scanner(System.in);
        int a;
        String surname;
        String name;
        double salary;
        /*for (int i = 0; i< 10; i++){
            a = new Random().nextInt(3);

            System.out.println("Input salary");
            salary = sc.nextDouble();
            switch (a){
                case 0: {
                    employees.add(new Employee(surnames[new Random().nextInt(surnames.length)], names[new Random().nextInt(names.length)], salary, new Manager()));
                    break;
                }
                case 1: {
                    employees.add(new Employee(surnames[new Random().nextInt(surnames.length)], names[new Random().nextInt(names.length)], salary, new TopManager(company)));
                    break;
                }
                case 2: {
                    employees.add(new Employee(surnames[new Random().nextInt(surnames.length)], names[new Random().nextInt(names.length)], salary, new Operator()));
                    break;
                }
            }

        }*/

        for (int i = 0; i<180; i++){
            salary = Math.ceil((30000 + Math.random()*10*1000)/100)*100;
            employees.add(new Employee(surnames[new Random().nextInt(surnames.length)], names[new Random().nextInt(names.length)], salary, new Operator()));
        }

        for (int i = 0; i<80; i++){
            salary = 60000;
            employees.add(new Employee(surnames[new Random().nextInt(surnames.length)], names[new Random().nextInt(names.length)], salary, new Manager()));
        }

        for (int i = 0; i<10; i++){
            salary = Math.ceil((80000 + Math.random()*20*1000)/100)*100;
            employees.add(new Employee(surnames[new Random().nextInt(surnames.length)], names[new Random().nextInt(names.length)], salary, new TopManager(company)));
        }

        company.hireAll(employees);
        ArrayList<Employee> sorted = company.getTopSalaryStaff(15);
        System.out.println("Top 15 salaries");
        for (int i = 0; i < 15; i++){
            System.out.println(Math.round(sorted.get(i).getSalary()) + " руб.");
        }

        sorted = new ArrayList<>();
        sorted = company.getLowestSalaryStaff(30);
        System.out.println("Bottom 30 salaries");
        for (int i = 0; i < 30; i++){
            System.out.println(Math.round(sorted.get(i).getSalary()) + " руб.");
        }

        for (int i = 0; i< 135; i++){
            company.fire(employees.get(new Random().nextInt(270-i)));
        }

        /*for (int i = 0; i < 135; i++){
            System.out.println(employees.get(i));
        }*/

        sorted = new ArrayList<>();
        sorted = company.getTopSalaryStaff(15);
        System.out.println("Top 15 salaries");
        for (int i = 0; i < 15; i++){
            System.out.println(Math.round(sorted.get(i).getSalary()) + " руб.");
        }

        sorted = new ArrayList<>();
        sorted = company.getLowestSalaryStaff(30);
        System.out.println("Bottom 30 salaries");
        for (int i = 0; i < 30; i++){
            System.out.println(Math.round(sorted.get(i).getSalary()) + " руб.");
        }
    }
}
