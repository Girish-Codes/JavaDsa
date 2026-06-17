package Arrays.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }

        for(int i=0; i<=array.length-2; i++) {
            int min = array[i];
            int minIndex = i;
            for(int j=i+1; j<=array.length-1; j++) {
                if(array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
