package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int a = Integer.parseInt(scanner.next());
        if (a <= 0) {
            throw new InvalidNumberException("Incorrect number");
        }
        System.out.println("Correct number");
    }
}
