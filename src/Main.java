import algorithms.*;
import utilities.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Array arrayCreator = new Array();
        PrintArray printArray = new PrintArray();

        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        BinarySearch binarySearch = new BinarySearch();
        Greedy01Knapsack greedy01Knapsack = new Greedy01Knapsack();
        GreedyJobSequencing greedyJobSequencing = new GreedyJobSequencing();

        int[] arr = new int[0];

        while (true) {
            try {
                System.out.println("\n\nSelect the operation to perform on the array!\n" +
                        "1   ==>  Experiment-1  (Insertion Sort)\n" +
                        "2   ==>  Experiment-2  (Selection Sort)\n" +
                        "3   ==>  Experiment-3  (Quick Sort)\n" +
                        "4   ==>  Experiment-4  (Merge Sort)\n" +
                        "5   ==>  Experiment-5  (Binary Search)\n" +
                        "6   ==>  Experiment-6  (Greedy 0/1 Knapsack Problem)\n" +
                        "7   ==>  Experiment-7  (Greedy Job Sequencing Problem)"/* +
                        "8   ==>  Experiment-8  (0/1 Knapsack Problem using Dynamic Programming)" +
                        "9   ==>  Experiment-9  (Shortest Paths using Dijkstra’s Algorithm)" +
                        "10  ==>  Experiment-10 (Minimum Cost Spanning Tree using Kruskal's Algorithm)" +
                        "11  ==>  Experiment-11 (Minimum Cost Spanning Tree using Prim's Algorithm)"*/);

                int ch = sc.nextInt();

                if (ch <= 4)
                    arr = arrayCreator.init();

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

                    case 6: greedy01Knapsack.init();
                        break;

                    case 7: greedyJobSequencing.init();
                        break;

                    default: System.out.println("Enter a number from 1 to 5 only!");
                        continue;
                }
                if (ch <= 5) {
                    printArray.printArray(arr);
                }
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("\nWrong Input!!  Try again.");
                sc.next();
            }
        }

        System.out.println("\n\nDo you want to do it again?\nEnter 'Y' if yes, any other character if no.");
        char ch = sc.next().charAt(0);
        if (ch == ('y'|'Y')) {
            main(null);
        }
    }
}