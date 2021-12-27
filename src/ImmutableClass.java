import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ImmutableClass {

    public static void main(String[] args) {


        Employee e1 = new Employee(1, "Vedant", getDOB("01/10/1993"));
        Employee e2 = new Employee(2, "jaiswal", getDOB("02/10/1993"));

        ConcurrentMap<Employee, String> map = new ConcurrentHashMap<>();

        map.put(e1,"jj");
        map.put(e2,"fdas");
        e1.getDob().setTime(213222222222223432L);
        System.out.println(map.get(e1));
        System.out.println(e1);

    }

    static Date getDOB(String date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}

final class Employee{
    private final Integer id;
    private final String name;
    private final Date dob;


    Employee(Integer id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return new Date(dob.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id) && name.equals(employee.name) && dob.equals(employee.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dob);
    }
}