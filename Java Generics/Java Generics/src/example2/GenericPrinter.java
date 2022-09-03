package example2;

public class GenericPrinter<T extends Animal>{
    T thingToPrint;

    public GenericPrinter(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }

    public void print(){
        thingToPrint.eat();
    }
}
