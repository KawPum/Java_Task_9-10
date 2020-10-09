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
        for (int i = 0; i< 10; i++){
            a = new Random().nextInt(2);

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

        }

        company.hireAll(employees);
        ArrayList<Employee> sorted = company.getTopSalaryStaff(5);
        for (int i = sorted.size()-1; i >= 0; i--){
            System.out.println(sorted.get(i));
        }
    }
}
