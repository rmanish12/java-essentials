package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Mike", 25, 10000));
        employees.add(new Employee(20, "Arun", 29, 20000));
        employees.add(new Employee(5, "Lisa", 35, 5000));
        employees.add(new Employee(1, "John", 32, 50000));

        // this will sort employees based on ID
        // as it has been implemented in employee's compareTo() method
        // which is overridden from Comparable interface
        Collections.sort(employees);
        employees.forEach(System.out::println);

        System.out.println("*".repeat(20));

        // Comparator is a functional interface
        // which can be used to sort objects based on the param we provide
        employees.sort(Employee.salaryComparator);
        employees.forEach(System.out::println);

        System.out.println("*".repeat(20));

        employees.sort((o1, o2) -> o1.age() - o2.age());
        employees.forEach(System.out::println);
    }
}
