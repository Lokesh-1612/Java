package Encapsulation.StaticMethod;

public class EvenOrOdd {

    private int num1;

    private static boolean isEvenOrodd(int num1) {
        if (num1 % 2 == 0) {

            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(" The given no is " + EvenOrOdd.isEvenOrodd(25));
    }
}
