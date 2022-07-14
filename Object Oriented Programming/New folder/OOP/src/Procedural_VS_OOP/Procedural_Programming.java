package Procedural_VS_OOP;

public class Procedural_Programming {
    public static void main(String[] args) {
        int baseSalary = 30000;
        int extrahour = 100;
        int hourlyRate = 20;
        int wage = wageCalculator(baseSalary,
                extrahour, hourlyRate);
        System.out.println("Your wage is : "+ wage);
    }

    public static int wageCalculator(int baseSalary,
                              int extraHour,
                              int hourlyRate){
        return baseSalary + extraHour * hourlyRate;
    }
}
