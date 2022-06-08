import java.util.Scanner;

/*TODO
Write a program that reads an array of ints and an integer number n.
The program must sum all the array elements greater than n.

Input data format

The first line contains the size of an array.
The second line contains the elements of the array separated by spaces.
The third line contains the number n.

Output data format

Only a single number representing the sum.
 */

public class SumOfNumsGreaterThanN {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please, enter the number of elements: ");
        int sizeOfArray = scanner.nextInt();
        int[] elementsOfArray = new int[sizeOfArray];

        int sumOfElements = 0;
        System.out.println("Please, enter the elements of the Array: ");

        for (int i = 0; i < sizeOfArray; i++) {
            elementsOfArray[i] = scanner.nextInt();
        }//for
        System.out.println("Please, enter the Number N:");
        int numberN = scanner.nextInt();

        for (int j : elementsOfArray) {
            if (j > numberN) {
                sumOfElements += j;
            }//if
        }
        System.out.println(sumOfElements);
    }//method
}//class
