class Container<T,R extends Number>{
    T name;
    R salary;
    public void show(){
        System.out.println("name is: " + name + "\nsalary is: "+salary);
    }
}
public class GenericsEx {
    public static void main(String[] args) {

        Container<String,Double> iContainer = new Container<>();
        iContainer.name="test";
        iContainer.salary=2.8;

        iContainer.show();

    }
}
