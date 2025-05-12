package interfaces;

public class Impl2 implements PlayWithNumbers {
    @Override
    public int add(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a + b;
    }

    @Override
    public int countLength(String str) {
        System.out.println("Overriding interface default method");
        return str.length() + 1;
    }
}
