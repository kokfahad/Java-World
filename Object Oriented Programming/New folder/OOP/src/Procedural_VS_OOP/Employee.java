package Procedural_VS_OOP;

public class Employee {

    private int baseSalary;
    private int extraHour;
    private int hourlyRate;


    public int wageCalculator(){
        return  baseSalary + extraHour * hourlyRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary < 0)
            throw new IllegalArgumentException("illegal argument passed");
        this.baseSalary = baseSalary;
    }

    public int getExtraHour() {
        return extraHour;
    }

    public void setExtraHour(int extraHour) {
        if (extraHour<0)
            throw new IllegalArgumentException("Wrong Arguments Passed");
        this.extraHour = extraHour;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
        throw new IllegalArgumentException("Wrong Arguments Passed");
        this.hourlyRate = hourlyRate;
    }





}
