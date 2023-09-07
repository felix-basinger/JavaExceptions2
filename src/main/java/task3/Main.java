package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        if (a > 100) {
            throw new NumberOutOfRangeException("First number is out of range");
        }
        if (b < 0) {
            throw new NumberOutOfRangeException("First number is out of range");
        }
        if (a + b < 10) {
            throw new NumberSumException("Sum is too small");
        }
        if (c == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed");
        }
        System.out.println("Successfully!");
    }
}
