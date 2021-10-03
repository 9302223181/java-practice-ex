import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

    public static void main(String[] args) {

        List<Laptop> lap = new ArrayList<>();

        lap.add(new Laptop("Dell",4,30000));
        lap.add(new Laptop("Apple",6,70000));
        lap.add(new Laptop("Hp",5,35000));

        //sort laptops based on ram size in ascending order using comparable
        Collections.sort(lap);

        //sort laptops based on ram size in descending order using comparable
        //Collections.sort(lap,Collections.reverseOrder());

        //method reference
        lap.forEach(System.out::println);

    }

}