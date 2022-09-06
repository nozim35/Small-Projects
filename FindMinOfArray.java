import java.util.Scanner;
import java.util.Arrays;

public class FindMinOfArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Please, enter the number of Elements of the Array: ");
        int sizeOfArray = scanner.nextInt();
        int[] elementsToBeSorted = new int[sizeOfArray];

        System.out.println("Please, enter the elements itself: ");

        for (int i = 0; i < sizeOfArray; i++) {
            elementsToBeSorted[i] = scanner.nextInt();
        }
        Arrays.sort(elementsToBeSorted);

        System.out.println(elementsToBeSorted[0]);
    }
}
