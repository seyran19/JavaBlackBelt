package comparaton.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee employee = new Employee("Chuck", 12);
        Employee employee2 = new Employee("Puck", 7);

        employees.add(employee);
        employees.add(employee2);

        Collections.sort(employees);
        System.out.println(employees);


    }

}
