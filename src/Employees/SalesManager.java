package Employees;

public class SalesManager implements Employee{
    private int employeeNumber;
    private int fixedSalaryPart;
    private int personalIncome;

    SalesManager () {
        generateFixedSalaryPart();
    }

    private void generateFixedSalaryPart (){
        int min = 30000;
        int max = 60000;
        max -= min;
        fixedSalaryPart = (int) (Math.random() * max) + min;
    }

    int makeSales (){
        int min = 0;
        int max = 130000;
        max -= min;
        personalIncome = (int) (Math.random() * max) + min;
        return personalIncome;
    }

    @Override
    public int getMonthSalary() {
        return fixedSalaryPart + (int) (personalIncome * 0.05);
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber){ this.employeeNumber = employeeNumber; }
}
