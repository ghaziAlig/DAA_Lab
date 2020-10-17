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
                System.out.println("\n\nSelect the operation to perform on the array!\n" +
                        "1  ==>  Experiment-1 (Insertion Sort)\n" +
                        "2  ==>  Experiment-2 (Selection Sort)\n" +
                        "3  ==>  Experiment-3 (Quick Sort)\n" +
                        "4  ==>  Experiment-4 (Merge Sort)\n" +
                        "5  ==>  Experiment-5 (Binary Search)\n" +
                        "6  ==>  Experiment-6 (Greedy 0/1 Knapsack Problem)\n" +
                        "7  ==>  Experiment-7 (Greedy Job Sequencing Problem)");

                int ch = sc.nextInt();
                switch (ch) {
                    case 1: arr = insertionSort.sort(arr);
                        break;

                    case 2: arr = selectionSort.sort(arr);
                        break;

                    case 3: arr = quickSort.init(arr);
                        break;

                    case 4: arr = mergeSort.init(arr);
                        break;

                    case 5: binarySearch.init(arr);
                        break;

                    default: System.out.println("Enter a number from 1 to 5 only!");
                        continue;
                }
                if (ch!=5) {
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
