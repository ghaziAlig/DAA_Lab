package utilities;
import java.util.*;

public class array {
    Scanner sc = new Scanner(System.in);
    public int[] init() {
        int[] arr;

        while (true) {
            try {
                System.out.println("\n\nHow do you want to generate array?\n" +
                        "1  ==>  Manual (Enter your values)\n" +
                        "2  ==>  Automatic (Random values)");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1: arr = Manual();
                        break;

                    case 2: arr = Automatic();
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

        return arr;
    }

    public int[] Manual() {
        System.out.println("\nEnter the number of elements in the array.");
        int arr_len = sc.nextInt();


        int[] arr =new int[arr_len];

        System.out.println("\nEnter the " + arr_len + " elements of the array.");

        for (int i=0; i<arr.length; i++) {
            try {
                arr[i] = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("\nWrong Input!!  Try again.");
                sc.next();
            }
        }

        System.out.print("\nEntered array is:\t");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        return arr;
    }


    public int[] Automatic() {
        Random random = new Random();
        int arr_len = random.nextInt(10-4)+4;
        int[] arr =new int[arr_len];

        for (int i=0; i<arr_len;i++) {
            try {
                arr[i] = random.nextInt(100);
            }
            catch (InputMismatchException e) {
                System.out.println("\nWrong Input!!  Try again.");
                random.nextInt(100);
            }
        }

        System.out.println("\nThe randomly generated " + arr_len + " element array is:");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();

        return arr;
    }
}