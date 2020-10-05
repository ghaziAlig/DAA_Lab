package algorithms;
import utilities.BinarySearchResult;
import java.util.InputMismatchException;

import java.util.*;

public class BinarySearch {
    public void init(int[] arr) {
        int result;
        int n=arr.length;
        Scanner sc =new Scanner(System.in);
        BinarySearchResult print = new BinarySearchResult();

        System.out.println("\nEnter the element that you want to search.");
        int x = sc.nextInt();

        while (true) {
            try {
                System.out.println("\nWhat method do you want to use?\n" +
                                    "1  ==>  Recursive\n" +
                                    "2  ==>  Iterative");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1: result = rescursivesearch(arr, 0, n - 1, x);
                        break;

                    case 2: result = iterativesearch(arr,x, n);
                        break;

                    default: System.out.println("Enter 1 or 2 only!");
                        continue;
                }
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("\nWrong Input!!  Try again.");
                sc.next();
            }
        }
        print.print(arr, x, result);
    }

    static int rescursivesearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return rescursivesearch(arr, l, mid-1, x);

            return rescursivesearch(arr, mid+1, r, x);
        }
        return -1;
    }

    static int iterativesearch(int[] arr, int x, int n) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;
    }
}
