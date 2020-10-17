package utilities;

public class BinarySearchResult {
    public void print(int[] arr, int x, int result) {
        if (result == -1)
            System.out.println("Element " + x + " not present in the given array.");
        else
            System.out.println("Element " + x + " found at index " + result);

        System.out.println("\n#####SEARCH RESULT#####");
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != x)
                System.out.print(arr[i]+"   ");
            else
                System.out.print("'" + arr[i] + "'" + "   ");
        }
        System.out.println();

    }
}
