import java.util.Scanner;

/*TODO
Given the number n, not greater than 100, create a matrix of size n×n and fill it using the following rule.
Numbers 0 should be stored on the primary (main) diagonal. The two diagonals, adjacent to the primary one, should contain numbers 1.
The next two diagonals should contain numbers 2; etc.

Note: the primary diagonal runs from the top left corner to the bottom right corner.
 */


public class CreateNxnMatrix {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {

        int sizeOfArray = scanner.nextInt();

        if (sizeOfArray <= 100) {
            int[][] matrix = new int[sizeOfArray][sizeOfArray];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = j - i;
                    System.out.print(Math.abs(j - i) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Please, do not exceed 100!");
        }
    }
}
