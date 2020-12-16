package algorithms;

import utilities.Array;
import java.util.*;
public class FindSubset {
    int[] set;
    int d;
    public void init(){
        int sum = 0;
        Array arrayInput = new Array();
        set = arrayInput.init();

        InsertionSort sort = new InsertionSort();
        set = sort.sort(set);

        System.out.println("\nThe sorted set is");
        for (int value : set) {
            System.out.print(value + "\t");
        }
        System.out.println();

        System.out.println("\nEnter the value of 'd', equal to whose sum you need to find subsets.");
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();

        int l = set.length;
        for (int i = 1 ; i <= l ; i++)
            sum = sum + set[i];

        if (sum < d || set[1] > d)
            System.out.println("\n No subset possible : ");
        else
            sumofsubset ( 0 , 1 , sum) ;
    }

    void sumofsubset(int m, int k, int r) {
        int i;
        int[] x = new int[k];
        x[k] = 1;

        if ( ( m + set[k] ) == d ) {
            System.out.print("Subset:");
            for ( i = 1 ; i <= k ; i++ )
                if ( x[i] == 1 )
                    System.out.println(set[i]);
            System.out.println ( "\n" ) ;
        }
        else
        if ( m + set[k] + set[k+1] <= d )
            sumofsubset ( m + set[k] , k + 1 , r - set[k] ) ;

        if ( ( m + r - set[k] >= d ) && ( m + set[k+1] <=d ) ) {
            x[k] = 0;
            sumofsubset(m, k + 1, r - set[k]);
        }
    }
}
