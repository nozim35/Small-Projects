import java.util.Scanner;

/*TODO
Find the sum of all elements of a sequence, ending with the number 0.

The number 0 itself is not included into the sequence and serves as a sign of cessation.
 */

public class SumOfAllElements {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    sumNumbers();
    }

    static void sumNumbers() {
    int userInput;
    int help = 0;
    int sumOfElements;

    do {
        userInput = scanner.nextInt();
        help += userInput;
        sumOfElements = help;
    } while (userInput != 0);

        System.out.println(sumOfElements);
    }
}
