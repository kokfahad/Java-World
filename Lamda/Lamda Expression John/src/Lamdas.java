public class Lamdas {
    public static void main(String[] args) {
        Cat cat = new Cat();
//        cat.print();
       Printable printable = () ->  System.out.println("meow2");
//        printThing( () ->  System.out.println("meow1"));
        printThing(printable);
    }

    static void printThing(Printable printable){
        printable.print();
    }
}
