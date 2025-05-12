package interfaces;

public class Main {
    public static void main(String[] args) {
        String str = "hello";

        PlayWithNumbers play1 = new Impl1();
        System.out.println(play1.add(10, 5));
        System.out.println(play1.multiply(10, 5));
        System.out.println(play1.countLength(str));

        System.out.println("*".repeat(20));

        PlayWithNumbers play2 = new Impl2();
        System.out.println(play2.add(10, 5));
        System.out.println(play2.multiply(10, 5));
        System.out.println(play2.countLength(str));

        System.out.println("*".repeat(20));

        PlayWithNumbers.sayHello();
    }
}
