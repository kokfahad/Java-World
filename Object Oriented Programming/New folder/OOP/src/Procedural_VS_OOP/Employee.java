package Procedural_VS_OOP;

public class Employee {

    private int baseSalary;
    private int extraHour;
    private int hourlyRate;

    public Employee(int baseSalary, int extraHour, int hourlyRate) {
     setBaseSalary(baseSalary);
     setHourlyRate(hourlyRate);
     setExtraHour(extraHour);
    }

    public int wageCalculator(){
        return  baseSalary + extraHour * hourlyRate;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary < 0)
            throw new IllegalArgumentException("illegal argument passed");
        this.baseSalary = baseSalary;
    }

    private int getExtraHour() {
        return extraHour;
    }

    private void setExtraHour(int extraHour) {
        if (extraHour<0)
            throw new IllegalArgumentException("Wrong Arguments Passed");
        this.extraHour = extraHour;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
        throw new IllegalArgumentException("Wrong Arguments Passed");
        this.hourlyRate = hourlyRate;
    }





}
