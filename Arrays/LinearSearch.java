package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        boolean keyFound = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                keyFound = true;
                System.out.println("Key "+key+" is found in " + i + "th Index");
                break;
            }
        }
        if(!keyFound) System.out.println("Key " +key+" not Found");
        sc.close();
    }
}
