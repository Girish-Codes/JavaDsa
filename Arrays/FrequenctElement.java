package Arrays;

import java.util.Scanner;

public class FrequenctElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Array to track which elements have been counted
        boolean visited[] = new boolean[size];
        
        for(int i = 0; i < arr.length; i++) {
            if(!visited[i]) {
                int count = 0;
                for(int j = i; j < arr.length; j++) {
                    if(arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " " + count);
            }
        }
        
        sc.close();
    }
}
