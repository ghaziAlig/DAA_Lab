package algorithms;
import utilities.BinarySearchResult;

import java.util.*;

public class BinarySearch {
    public void init(int[] arr) {
        int n=arr.length;
        Scanner sc =new Scanner(System.in);
        BinarySearchResult print = new BinarySearchResult();

        System.out.println("\nEnter the element that you want to search.");
        int x = sc.nextInt();

        int result = search(arr, 0, n - 1, x);

        print.print(arr, x, result);
    }

    static int search(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return search(arr, l, mid - 1, x);

            return search(arr, mid + 1, r, x);
        }
        return -1;
    }
}
