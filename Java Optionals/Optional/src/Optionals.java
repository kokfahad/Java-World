//Optional is like a container. Either has something on it or null

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        Optional<Cat> myCat = Optional.of(findByCatName("Fahad").orElse(new Cat("Default")));
//        if (myCat.isPresent()){
//           System.out.println(myCat.get().name);
//           System.out.println(myCat.get().age);
//        }
//        else {
//            System.out.println("value is not present");
//        }
//        Cat defaultVal = myCat.orElse(new Cat("Unknown"));
//        Cat defaultVal=myCat.orElseGet(()-> new RuntimeException("Cat value not found"));
        System.out.println(myCat.get().name);
    }

    public static Optional<Cat> findByCatName(String name){
        Cat cat = new Cat(name);
        return Optional.ofNullable(null); // this how to return in optional. ofNullable means value can be present or not. But if use only of() then u are sure that value is present.
    }
}
