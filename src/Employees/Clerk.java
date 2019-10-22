package Employees;

public class Clerk implements Employee{
    private int employeeNumber;
    private int fixedSalaryPart;

    Clerk (){
        generateFixedSalaryPart();
    }

    private void generateFixedSalaryPart (){
        int min = 30000;
        int max = 50000;
        max -= min;
        fixedSalaryPart = (int) (Math.random() * max) + min;
    }

    @Override
    public int getMonthSalary() {
        return fixedSalaryPart;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber){ this.employeeNumber = employeeNumber; }
}