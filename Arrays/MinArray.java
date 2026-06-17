package Arrays;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];

        for(int i=0; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}
