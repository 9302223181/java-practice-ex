import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {

        public static void main(String[] args) {

        List<Laptop> lap = new ArrayList<>();

        lap.add(new Laptop("Dell",4,40000));
        lap.add(new Laptop("Apple",6,70000));
        lap.add(new Laptop("Hp",5,35000));

            Comparator<Laptop> comparator = (o1, o2) -> {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
                //same way
                //return Integer.compare(o1.getPrice(), o2.getPrice());
            };

        //sort laptops in ascending order using Comparator
        Collections.sort(lap,comparator);

        //sort laptops in descending order using Comparator
        //Collections.sort(lap,comparator.reversed());

        //method reference
        lap.forEach(System.out::println);

    }
}
