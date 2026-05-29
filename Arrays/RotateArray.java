package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int k) {

        int n = arr.length;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
}
