package comparators;

import java.util.Comparator;

// Java provides Comparable interface which should be implemented by any custom class
// if we want to use Arrays or Collections default sorting method
public record Employee(int id, String name, int age, int salary) implements Comparable<Employee> {
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    // if we want to have custom and dynamic sorting
    // we need to create a Comparator
    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.salary() - o2.salary();
        }
    };
}
