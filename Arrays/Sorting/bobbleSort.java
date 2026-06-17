package Arrays.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bobbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int[] array = new int[sc.nextInt()];
        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array Before Sorting: "+Arrays.toString(array));
        int n = array.length;
        for(int i=0; i<=n-2; i++) {
            for(int j=0; j<=n-2-i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Array After Sorting: "+Arrays.toString(array));
        sc.close();
    }
}
