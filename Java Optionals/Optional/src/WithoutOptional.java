public class WithoutOptional {

    public static void main(String[] args) {
        Cat getCat = findByCatName("Rahad");

        if(getCat != null){
            System.out.println(getCat.name);
            System.out.println(getCat.age);
        }else {
            System.out.println("Null value present");
        }

    }

    public static Cat findByCatName(String name){
        Cat cat = new Cat(name);
//        return cat;
        return null;
    }
}
