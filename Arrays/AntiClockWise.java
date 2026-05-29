package Arrays;
//Anti-Clockwise Rotation of an Array one Time

import java.util.Arrays;
import java.util.Scanner;

public class AntiClockWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
        swapArray(array, 0, size-1);
        swapArray(array, 0, size-2);
        System.out.println(Arrays.toString(array));
        sc.close();
    }

    public static void swapArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}
