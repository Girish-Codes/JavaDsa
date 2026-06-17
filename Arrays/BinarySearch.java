package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;

        int mid = left + right / 2;

        int result = binarySearch(arr, left, right, mid, key);
        if(result > 0) {
            System.out.println(key + " is found");
        } else {
            System.out.println(key+" isn't found");
        }
        sc.close();
    }

    public static int binarySearch(int[] arr, int left, int right, int mid, int key) {
        while (left <= right) {
            if(key == arr[mid]) {
                return 1;
            } else if (key < arr[mid]) {
                right = mid + 1;
            } else if ( key > arr[mid] ) {
                left = mid - 1;
            }
        }
        return -1;
    }
}
