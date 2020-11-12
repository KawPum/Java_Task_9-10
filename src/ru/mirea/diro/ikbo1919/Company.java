package ru.mirea.diro.ikbo1919;

import java.util.ArrayList;

public class Company {
    private double income;
    private ArrayList<Employee> employees;

    public Company(double income, ArrayList<Employee> employees) {
        this.income = income;
        this.employees = employees;
    }

    public double getIncome() {
        return income;
    }

    public void hire(Employee new_employee){
        this.employees.add(new_employee);
    }

    public void hireAll(ArrayList<Employee> employees){
        this.employees = employees;
    }

    public void fire(Employee employee){
        this.employees.remove(employee);
    }

    public ArrayList getTopSalaryStaff(int count){
        ArrayList<Employee> sorted = new ArrayList<>();
        this.ShakerSort(employees);
        for (int i = 0; i < count; i++){
            sorted.add(employees.get(employees.size()-i-1));
        }
        System.out.println(sorted.size());
        return sorted;
    }

    public ArrayList getLowestSalaryStaff(int count){
        ArrayList<Employee> sorted = new ArrayList<>();
        this.ShakerSort(employees);
        for (int i = employees.size()-1; i > employees.size()-count-1; i--){
            sorted.add(employees.get(employees.size()-i-1));
        }
        return sorted;
    }

    private void ShakerSort(ArrayList<Employee> list){
        if(list.isEmpty()) return;

        int left = 0;
        int right = list.size() - 1;
        while (left <= right){
            for (int i = right; i> left; i--){
                if (list.get(i-1).getSalary() > list.get(i).getSalary()){
                    Employee temp = list.get(i-1);
                    list.set(i-1, list.get(i));
                    list.set(i, temp);
                }
            }
            left++;
            for (int i = left; i < right; i++){
                if (list.get(i).getSalary() > list.get(i+1).getSalary()){
                    Employee temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                }
            }
            right --;
        }
    }
}
