package utilities;

public class PrintArray {
    public void printArray(int[] arr) {
        System.out.print("\nSorted Array is:    ");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
}
