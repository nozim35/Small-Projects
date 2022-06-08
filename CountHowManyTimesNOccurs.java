import java.util.Scanner;

/*TODO
Write a program that reads an array of ints and an integer number n.

The program must check how many times n occurs in the array.

Input data format
The first line contains the size of the input array.

The second line contains elements of the array separated by spaces.

The third line contains n.

Output data format

The result is only a single non-negative integer number.


 */
public class CountHowManyTimesNOccurs {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Please, enter the number of inputs: ");
        int sizeOfArray = scanner.nextInt();

        int [] elements = new int[sizeOfArray];

        int counter = 0;

        System.out.print("\nPlease, enter the elements of the array:\n");
        for (int i = 0; i < sizeOfArray; i++) {
            elements[i] = scanner.nextInt();
        }

        System.out.print("\nPlease, enter the number that need to be checked: ");
        int numberToBeChecked = scanner.nextInt();

        for (int k : elements) {
            if (k == numberToBeChecked) {
                counter++;
            }
        }
        System.out.println(counter);

    }//mainMethod
}//class
