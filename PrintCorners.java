import java.util.Scanner;

/*TODO
It should print all corner elements of the twoDimArray in the following order: left to right and top to bottom.

The elements must be separated by space and printed as an example below.

Input array:

1 0 2
0 0 0
3 0 4
Printed corners:

1 2
3 4
Notice, that you must always print 4 corners, for example:

Input array:

1
2
3
Printed corners:

1 1
3 3
 */

public class PrintCorners {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please, enter the first axis of 2-d Array:");
        int columnOfArray = scanner.nextInt();
        System.out.print("\nPlease, enter the second axis of 2-d Array:");
        int rowOfArray = scanner.nextInt();

        int[][] twoDimArray = new int[columnOfArray][rowOfArray];
        System.out.println("Please, enter the elements of Array");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }
        printCorners(twoDimArray);
    }

    public static void printCorners(int[][] twoDimArray) {

        int firstFirst = twoDimArray[0][0];
        int firstLast = twoDimArray[0][twoDimArray[0].length - 1];
        int lastFirst = twoDimArray[twoDimArray.length - 1][0];
        int lastLast = twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1];

        System.out.printf("%d %d\n%d %d",firstFirst, firstLast, lastFirst, lastLast);
    }
}
