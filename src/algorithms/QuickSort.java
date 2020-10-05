package algorithms;

public class QuickSort {
    public int[] init(int[] arr) {
        int n = arr.length;
        QuickSort obj = new QuickSort();
        obj.sort(arr, 0, n - 1);
        return arr;
    }

    private void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    private int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int i = (lo-1);
        for (int j=lo; j<hi; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[hi];
        arr[hi] = temp;

        return i+1;
    }
}
