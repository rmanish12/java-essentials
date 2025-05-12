package interfaces;

public interface PlayWithNumbers {
    // methods are by default public and abstract
    int add(int a, int b);
    int multiply(int a, int b);

    // default method can have method body
    // these methods need not be overridden in the child class
    default int countLength(String str) {
        print(str);
        return str.length();
    }

    // static methods can be private
    // can be called from default method or other static methods
    private static void print(String str) {
        System.out.println("Interface static method");
        System.out.println(str);
    }

    // static methods similar to ones we have in classes
    // cannot be overridden
    static void sayHello() {
        System.out.println("Hello!!!");
    }
}
