package algorithms;

import java.util.*;
import utilities.*;

public class FindSubset {
    public void init() {
        int[] set =new int[10];
        int[] x =new int[10];
        int n,d,sum,flag=0;
        int j;

        System.out.print("Enter the number of elements of set: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        System.out.print("Enter the elements of set: ");
        for(int i=1;i<=n;i++)
            set[i]=sc.nextInt();

        System.out.print("\nEnter the number equal to which you need to find the subsets: ");
        d=sc.nextInt();

        if(d>0) {
            for(int i=1;i<=Math.pow(2,n)-1;i++) {
                Subset s=new Subset();
                s.subset(i,n,x);
                sum=0;

                for(j=1;j<=n;j++)
                    if(x[j]==1)
                        sum=sum+set[j];
                if(d==sum) {
                    System.out.print("Subset elements: ");
                    flag=1;

                    for(j=1;j<=n;j++)
                        if(x[j]==1)
                            System.out.print(set[j]+" ");
                    System.out.println();
                }
            }
        }
        if(flag==0)
            System.out.println("No subset exists!");
    }
}