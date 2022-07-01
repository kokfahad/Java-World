public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.print();
        myPrint((a,b)-> {
            int c = a+b;
            System.out.println(c);
        });
    }

    public static void myPrint(Printable printable){
        printable.print(20,30);
    }
}
