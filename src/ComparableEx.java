import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

    public static void main(String[] args) {

        List<Laptop> lap = new ArrayList<>();
        lap.add(new Laptop("Dell",4,30000));
        lap.add(new Laptop("Apple",6,70000));
        lap.add(new Laptop("Hp",4,35000));

        Collections.sort(lap);

        //method reference
        lap.forEach(System. out::println);
    }

}
class Laptop implements  Comparable<Laptop>{

    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop o) {
        return this.getBrand().compareTo(o.getBrand());
    }
}