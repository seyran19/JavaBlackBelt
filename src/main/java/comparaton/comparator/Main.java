package comparaton.comparator;



import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee employee = new Employee("Chuck", 12);
        Employee employee2 = new Employee("Duck", 7);

        employees.add(employee);
        employees.add(employee2);

        employees.sort(new AgeComparator());
        System.out.println(employees);
    }
}
