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
        KnapsackDynamic knapsackDynamic = new KnapsackDynamic();
        ShortestPaths shortestPaths = new ShortestPaths();
        KruskalMCST kruskalMCST = new KruskalMCST();
        PrimMCST primMCST = new PrimMCST();
        FindSubset findSubset = new FindSubset();
        AllPairShortestPaths allPairShortestPaths = new AllPairShortestPaths();
        NQueen nQueen = new NQueen();
        TravellingSalesman travellingSalesman = new TravellingSalesman();

        int[] arr = new int[0];

        while (true) {
            try {
                System.out.println("\n\nSelect from the EXPERIMENTS below to perform!\n" +
                        "1   ==>  Experiment-1  (Insertion Sort)\n" +
                        "2   ==>  Experiment-2  (Selection Sort)\n" +
                        "3   ==>  Experiment-3  (Quick Sort)\n" +
                        "4   ==>  Experiment-4  (Merge Sort)\n" +
                        "5   ==>  Experiment-5  (Binary Search)\n" +
                        "6   ==>  Experiment-6  (Greedy 0/1 Knapsack Problem)\n" +
                        "7   ==>  Experiment-7  (Greedy Job Sequencing Problem)\n" +
                        "8   ==>  Experiment-8  (0/1 Knapsack Problem using Dynamic Programming)\n" +
                        "9   ==>  Experiment-9  (Shortest Paths using Dijkstra’s Algorithm)\n" +
                        "10  ==>  Experiment-10 (Minimum Cost Spanning Tree using Kruskal's Algorithm)\n" +
                        "11  ==>  Experiment-11 (Minimum Cost Spanning Tree using Prim's Algorithm)\n" +
                        "12  ==>  Experiment-12 (To  find a subset of a given set S = {s1, s2,....., sn}...)\n" +
                        "13  ==>  Experiment-13 (All-Pairs Shortest Paths Problem using Floyd's algorithm)\n" +
                        "14  ==>  Experiment-14 (N Queen's problem using Back Tracking)\n" +
                        "15  ==>  Experiment-15 (Travelling salesperson problem (TSP) using dynamic programming.)");

                int ch = sc.nextInt();

                if (ch <= 5)
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

                    case 8: knapsackDynamic.init();
                    break;

                    case 9: shortestPaths.init();
                    break;

                    case 10: kruskalMCST.init();
                    break;

                    case 11: primMCST.init();
                    break;

                    case 12: findSubset.init();
                    break;

                    case 13: allPairShortestPaths.init();
                    break;

                    case 14: nQueen.init();
                    break;

                    case 15: travellingSalesman.init();
                    break;

                    default: System.out.println("Enter a number from 1 to 15 only!");
                    continue;
                }
                if (ch <= 4) {
                    printArray.printArray(arr);
                }
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("\nWrong Input!!  Try again.");
                sc.next();
            }
        }

        System.out.println("\n\nEnter 'Y' to PERFORM AN EXPERIMENT AGAIN.\nAny other character to EXIT!");
        char ch = sc.next().charAt(0);
        if (ch == ('y'|'Y')) {
            main(null);
        }
    }
}