package utilities;

public class BinarySearchResult {
    public void print(int[] arr, int x, int result) {
        if (result == 1)
            System.out.println("Element not present in the given array.");
        else
            System.out.println("Element found at index " + result);

        for (int i=0; i<arr.length; i++) {
            if (i!=x)
                System.out.print(arr[i]+"\t");
            else
                System.out.print("'" + arr[i] + "'" + "\t");
        }

    }
}
