package Employees;

import java.util.*;

public class Company {
    public static int totalIncome;
    public int workplaces = 270;
    public int amountOfHiredEmployees = 1;
    private ArrayList<Employee> employees = new ArrayList<>();


    public void hireTopManagers (int amount){
        if (amount + amountOfHiredEmployees <= workplaces) {
            for (int i = 0; i < amount; i++) {
                TopManager topManager = new TopManager();
                employees.add(topManager);
                topManager.setEmployeeNumber(amountOfHiredEmployees);
                amountOfHiredEmployees++;
            }
        }
        else {
                System.out.println("Рабочих мест недостаточно для такого кол-ва сотрудников. \nДоступно рабочих мест: " + (workplaces - amountOfHiredEmployees));
            }
        }

    public void hireSalesManagers (int amount){
        if (amount + amountOfHiredEmployees <= workplaces){
            for (int i = 0; i < amount; i++) {
                SalesManager salesManager = new SalesManager();
                employees.add(salesManager);
                salesManager.setEmployeeNumber(amountOfHiredEmployees);
                amountOfHiredEmployees++;
                totalIncome += salesManager.makeSales();
            }
        }
        else {
                System.out.println("Рабочих мест недостаточно для такого кол-ва сотрудников. \nДоступно рабочих мест: " + (workplaces - amountOfHiredEmployees));
            }
        }

    public void hireClerks (int amount){
        if (amount + amountOfHiredEmployees <= workplaces){
            for (int i = 0; i < amount; i++) {
                Clerk clerk = new Clerk();
                employees.add(clerk);
                clerk.setEmployeeNumber(amountOfHiredEmployees);
                amountOfHiredEmployees++;
            }
        }
        else {
                System.out.println("Рабочих мест недостаточно для такого кол-ва сотрудников. \nДоступно рабочих мест: " + (workplaces - amountOfHiredEmployees));
            }
        }

    public void fireEmployee (Employee employee){
        employees.remove(employee.getEmployeeNumber());
        amountOfHiredEmployees--;
    }

    public void getTopSalaryStuff (int count){
        calculateMonthSalaries();
        if (count < amountOfHiredEmployees) {
            for (int i = 0; i < count; i++){
                System.out.println(employees.get(i).getEmployeeNumber() + " " + employees.get(i).getMonthSalary());
            }
        }
        else {
            System.out.println("В компании не работает столько людей.");
        }
    }

    public void getLowestSalaryStuff (int count){
        calculateMonthSalaries();
        if (count < amountOfHiredEmployees) {
            for (int i = employees.size() - 1; i > (employees.size() - 1) - count; i--){
                System.out.println(employees.get(i).getEmployeeNumber() + " " + employees.get(i).getMonthSalary());
            }
        }
        else {
            System.out.println("В компании не работает столько людей.");
        }
    }

    private void calculateMonthSalaries(){
        for (Employee employee : employees){
            employee.getMonthSalary();
        }
        Collections.sort(employees, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o2.getMonthSalary(),o1.getMonthSalary());
            }
        });
    }
}

