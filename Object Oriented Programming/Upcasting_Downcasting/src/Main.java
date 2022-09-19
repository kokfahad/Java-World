public class Main {
    public static void main(String[] args) {
        var animal = new Animal();
        var dog = new Dog();
        upcasting(dog);
        downcasting(dog);
    }
    public static void upcasting(Animal animal){
        System.out.println(animal);

    }

    public static void downcasting(Animal animal){
        var dog = (Dog) animal;
        System.out.println(dog);
    }
}
