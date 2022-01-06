package OptionalTask;

import java.util.Scanner;
import java.util.Stack;

public class IntToStack {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Требуется ввести число");
        int number = scan.nextInt();
        numbers.push(number);

        String stringNumber = numbers.peek().toString();
        StringBuilder reverseNumber = new StringBuilder(stringNumber);
        reverseNumber.reverse();
        System.out.println("Цифры в обратном порядке " + reverseNumber);
    }
}
