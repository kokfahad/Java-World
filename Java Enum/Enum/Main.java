public class Main {
    public static void main(String[] args) {
//        DaysOfTheWeek days = null ;
//        System.out.println(days.Saturday);;
//
//        //traversing all values in enum
//        for (DaysOfTheWeek day : DaysOfTheWeek.values()){
//            System.out.println(day);

        Cereals cereals = null;
        System.out.println(cereals.Kokocrunch.tasteLevel);
        System.out.println(cereals.Oats.tasteLevel);

        for (Cereals cereal : Cereals.values()){
            System.out.println(cereal +" "+ cereal.tasteLevel + " price" +
                    " " + cereal.price);
        }
        }

}



