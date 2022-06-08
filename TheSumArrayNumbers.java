import java.util.Scanner;

/*TODO
Write a program that calculates the sum of the elements of an array of ints.

Input data format

The first line contains the size of an array.

The second line contains elements of the array separated by spaces.


Output data format

The sum of the input array elements.
 */

public class TheSumArrayNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please, enter the size of the Array:");
        int sizeOfArray = scanner.nextInt();
        int[] elementsOfArray = new int[sizeOfArray];
        int sumOfElements = 0;

        System.out.println("Please, enter the elements of the Array:");
        for (int i = 0; i < sizeOfArray; i++) {
            elementsOfArray[i] = scanner.nextInt();
        }
        for (int k : elementsOfArray) {
            sumOfElements += k;
        }
        System.out.println(sumOfElements);
     }
}