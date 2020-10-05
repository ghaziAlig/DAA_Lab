package utilities;
import java.util.*;

public class array {
    Scanner sc = new Scanner(System.in);

    public int[] createArray() {
        System.out.println("\nEnter the number of elements in the array.");
        int n = sc.nextInt();

        int[] arr =new int[n];

        System.out.println("\nEnter the " + n + " elements of the array.");

        for (int i=0; i<arr.length; i++) {
            try {
                arr[i] = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("\nWrong Input!!  Try again.");
                sc.next();
            }
        }

        System.out.print("\nEntered array is:\t");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        return arr;
    }
}
