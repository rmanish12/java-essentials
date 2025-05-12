package records;

import java.util.Objects;

public class Person {

    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Person other)) {
            return false;
        } else {
            return Objects.equals(name, other.name)
                    && Objects.equals(address, other.address);
        }
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}
