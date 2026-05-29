package Arrays;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];

        System.out.print("[");
        for(int i : array) {
            if(i < array.length){
                System.out.print(i +", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.print("]");

        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
