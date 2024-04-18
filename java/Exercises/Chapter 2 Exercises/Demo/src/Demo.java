import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add("Warren Buffet");
        people.add("Jeff Bezos");
        people.add("Bill Gates");


        List<Person> hundredClub = people.stream()
                .filter(person -> person.billions >= 100)
                .sorted(Comparator.comparing(person -> person.name))
                .collction(Collectors.toList());

    }//end main

}//end class
