import java.util.Scanner;


/*TODO:
You are given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4. As input,
the program gets the number of elements in the sequence, and then the elements themselves.
In the sequence, there is always an element divisible by 4.
The number of elements does not exceed 1000.
The program should print a single number: the maximum element of the sequence divisible by 4.
 */

public class FindMaxDivByFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter the number of elements: ");

        int numOfElements = scanner.nextInt();
        int userInput;
        int max;
        int help = 0;

        if (numOfElements <= 1000) {

            System.out.println("Please, enter the elements themselves: ");

            while (numOfElements > 0) {
                numOfElements--;

                userInput = scanner.nextInt();

                if(userInput <= 30_000 ) {
                    if (userInput % 4 == 0) {
                        max = userInput > help ? userInput : help;
                        help = max;
                    }//if
                } else {
                    System.out.println("The number must not exceed 30 000!");
                }
            }//while
            System.out.println(help);
        } else {
            System.out.println("The number of elements must not exceed 1000!");
        }
    }//mainMethod
}//class
