import Employees.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.hireTopManagers(10);
        company.hireSalesManagers(150);
        company.hireClerks(company.workplaces - company.amountOfHiredEmployees);
        System.out.println("Выручка компании: " + Company.totalIncome);

        System.out.println("наибольшая зп:");
        company.getTopSalaryStuff(10);
        System.out.println("наименьшая зп:");
        company.getLowestSalaryStuff(4);


    }
}
