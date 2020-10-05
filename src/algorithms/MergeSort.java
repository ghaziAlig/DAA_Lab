package algorithms;

public class MergeSort {
    public int[] init(int[] arr) {
        int n = arr.length;
        MergeSort obj = new MergeSort();
        obj.sort(arr, 0, n - 1);
        return arr;
    }

    void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    void merge(int[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left_subarray = new int[n1];
        int[] right_subarray = new int[n2];

        if (n1 >= 0) System.arraycopy(arr, l, left_subarray, 0, n1);
        for (int j = 0; j < n2; ++j)
            right_subarray[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (left_subarray[i] <= right_subarray[j]) {
                arr[k] = left_subarray[i];
                i++;
            }
            else {
                arr[k] = right_subarray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left_subarray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right_subarray[j];
            j++;
            k++;
        }
    }
}
