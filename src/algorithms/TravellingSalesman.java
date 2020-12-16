package algorithms;

import java.util.*;
public class TravellingSalesman {
    static int V = 4;
    static int travellingSalesman(int[][] graph, int s) {
        ArrayList<Integer> vertex =
                new ArrayList<>();

        for (int i = 0; i < V; i++)
            if (i != s)
                vertex.add(i);

        int min_path = Integer.MAX_VALUE;
        do {
            int current_pathweight = 0;

            int k = s;

            for (Integer integer : vertex) {
                current_pathweight += graph[k][integer];
                k = integer;
            }
            current_pathweight += graph[k][s];

            min_path = Math.min(min_path, current_pathweight);

        } while (findNextPermutation(vertex));

        return min_path;
    }

    public static void swap(ArrayList<Integer> data, int left, int right) {
        int temp = data.get(left);
        data.set(left, data.get(right));
        data.set(right, temp);
    }

    public static void reverse(ArrayList<Integer> data, int left, int right) {
        while (left < right) {
            int temp = data.get(left);
            data.set(left++, data.get(right));
            data.set(right--, temp);
        }
    }

    public static boolean findNextPermutation(ArrayList<Integer> data) {
        if (data.size() <= 1)
            return false;

        int last = data.size() - 2;

        while (last >= 0) {
            if (data.get(last) < data.get(last + 1)) {
                break;
            }
            last--;
        }

        if (last < 0)
            return false;

        int nextGreater = data.size() - 1;

        for (int i = data.size() - 1; i > last; i--) {
            if (data.get(i) > data.get(last)) {
                nextGreater = i;
                break;
            }
        }

        swap(data, nextGreater, last);

        reverse(data, last + 1, data.size() - 1);

        return true;
    }

    public void init() {
        int[][] graph = {{0, 18, 23, 28},
                         {18, 0, 43, 33},
                         {23, 43, 0, 38},
                         {28, 33, 38, 0}};
        int s = 0;
        System.out.println("\nThe minimum cost of the tour is found to be = " + travellingSalesman(graph, s));
    }
}
