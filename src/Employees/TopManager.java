package Employees;

public class TopManager implements Employee{
    private int employeeNumber;
    private int fixedSalaryPart;

    TopManager (){
        generateFixedSalaryPart();
    }

    private void generateFixedSalaryPart (){
        int min = 100000;
        int max = 200000;
        max -= min;
        fixedSalaryPart = (int) (Math.random() * max) + min;
    }

    @Override
    public int getMonthSalary() {
        if (Company.totalIncome >= 10000000){
            return fixedSalaryPart + (int) (Company.totalIncome * 0.01);
        }
        else {
            return fixedSalaryPart;
        }
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber){ this.employeeNumber = employeeNumber; }
}
