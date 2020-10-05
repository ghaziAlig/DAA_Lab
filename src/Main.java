import algorithms.*;
import utilities.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        array arrayCreator = new array();
        PrintArray printArray = new PrintArray();

        BinarySearch binarySearch = new BinarySearch();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        SelectionSort selectionSort = new SelectionSort();

        int[] arr = arrayCreator.createArray();

        while (true) {
            try {
                System.out.println("\nSelect the operation to perform on the array!\n" +
                        "1  ==>  Binary Search\n" +
                        "2  ==>  InsertionSort\n" +
                        "3  ==>  Merge Sort\n" +
                        "4  ==>  Quick Sort\n" +
                        "5  ==>  Selection Sort");

                int ch = sc.nextInt();
                switch (ch) {
                    case 1: binarySearch.init(arr);
                    break;

                    case 2: arr = insertionSort.sort(arr);
                    break;

                    case 3: arr = mergeSort.init(arr);
                    break;

                    case 4: arr = quickSort.init(arr);
                    break;

                    case 5: arr = selectionSort.sort(arr);
                    break;

                    default: System.out.println("Enter a number from 1 to 5 only!");
                    continue;
                }
                if (ch>1) {
                    printArray.printArray(arr);
                }
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("\nWrong Input!!  Try again.");
                sc.next();
            }
        }
    }
}
