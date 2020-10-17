package utilities;

public class BinarySearchResult {
    public void print(int[] arr, int x, int result) {
        if (result == -1)
            System.out.println("Element " + x + " not present in the given array.");
        else
            System.out.println("Element " + x + " found at index " + result);

        System.out.println("\n########SEARCH RESULT########\n");
        for (int j : arr) {
            if (j != x)
                System.out.print(j + "   ");
            else
                System.out.print("'" + j + "'" + "   ");
        }
        System.out.println("\n\n#############################");
        System.out.println();

    }
}
