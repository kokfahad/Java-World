package Procedural_VS_OOP;

public class OOP_Programming {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(20000);
        employee.setExtraHour(100);
        employee.setHourlyRate(20);
        int wage = employee.wageCalculator();
        System.out.println("Hell Sir!!! " +
                "Your wages is: " +
                wage);
    }
}
