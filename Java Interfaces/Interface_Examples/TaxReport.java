public class TaxReport {
    private TaxCalculator2018 calculator;

    public TaxReport(TaxCalculator2018 calculator) {
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }



}
