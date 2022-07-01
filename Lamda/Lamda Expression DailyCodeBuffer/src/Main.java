import java.util.List;

public class Main {

    interface CheckPerson{
        boolean test(Person p);
    }
    static class CheckPersonEligibleForSearch implements CheckPerson{

        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 25 && p.getAge() <30;
        }
    }

    public static void printPersonOlderThan(List<Person> people , int age ){
        for (Person p : people){
            if(p.age>=age){
                p.printPerson();
            }
        }
    }

    public static void printPersonWithinRange(List<Person> people, int low, int high){
        for (Person p : people){
            if (p.getAge() >= low && p.getAge() <high){
                p.printPerson();
            }
        }
    }

    public static void printPeople(List<Person> people , CheckPerson tester){

        for (Person p : people){
            if(tester.test(p)){
               p.printPerson();
            }
        }

    }

    public static void main(String[] args) {

        List<Person>people = Person.generateDefaultList();

//        printPersonOlderThan(people,23);
//        printPersonWithinRange(people,25,26);
//        printPeople(people, new CheckPersonEligibleForSearch());

//        Anynomous class
//        printPeople(people, new CheckPerson() {
//            @Override
//            public boolean test(Person p) {
//                return p.gender == Person.Sex.MALE &&
//                        p.getAge() >= 25 && p.getAge() <30;
//            }
//        });

//      lamdas
        printPeople(people, (p) -> {
                return p.gender == Person.Sex.MALE &&
                        p.getAge() >= 25 && p.getAge() <30;
            }
        );
    }

}
