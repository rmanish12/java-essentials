package records;

public class Main {
    public static void main(String[] args) {
        String name = "John Doe";
        String address = "100, NY";

        Person person = new Person(name, address);
        System.out.println(person.getName());
        System.out.println(person.getAddress());

        Person person2 = new Person(name, address);
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person.equals(person2));
        System.out.println(person);

        System.out.println("*".repeat(20));

        // a public constructor with argument fields is automatically generated
        PersonRecord personRecord = new PersonRecord(name, address);

        // we get getter methods whose name matches the name of the field
        System.out.println(personRecord.name());
        System.out.println(personRecord.address());

        PersonRecord personRecord1 = new PersonRecord(name, address);

        // hashCode method returns the same value for two objects if
        // all the field values for both objects match
        System.out.println(personRecord.hashCode());
        System.out.println(personRecord1.hashCode());

        // an equals method is generated if the supplied object is
        // of same type and the values of all its fields match
        System.out.println(personRecord.equals(personRecord1));

        // toString method that results in a string containing the name of the record,
        // followed by the name of each field and its corresponding value in square brackets
        System.out.println(personRecord);

        System.out.println("*".repeat(20));

        // will throw null pointer exception due to validation
//        AnotherPersonRecord anotherPersonRecord = new AnotherPersonRecord(name, null);

        System.out.println(AnotherPersonRecord.UNKNOWN);
        AnotherPersonRecord anotherPersonRecord = new AnotherPersonRecord(name, address);
        AnotherPersonRecord anotherPersonRecord1 = AnotherPersonRecord.unnamed(address);

        System.out.println(anotherPersonRecord.address());
        System.out.println(anotherPersonRecord1.address());
    }
;}
