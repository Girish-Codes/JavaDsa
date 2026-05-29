package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        if(!sc.hasNextInt()) return;

        String inputLine1 = sc.nextLine().trim();
        String[] token1 = inputLine1.split("\\s");
        int[] arr1 = new int[token1.length];

        for(int i=0; i<token1.length; i++) {
            arr1[i] = Integer.parseInt(token1[i]);
        }

        String inputLine2 = sc.nextLine().trim();
        String[] token2 = inputLine2.split("\\s");
        int[] arr2 = new int[token2.length];

        
        for(int i=0; i<token2.length; i++) {
            arr2[i] = Integer.parseInt(token2[i]);
        }

        int[] c = new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length; i++) {
            c[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++) {
            c[arr1.length+i] = arr2[i];
        }

        
        for(int i=0; i<c.length; i++) {
            for(int j=0; j<c.length-1; j++) {
                if(c[j] > c[j+1]) {
                    int temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(c));
        System.out.println(c[0] +" "+ c[c.length-1]);

    }
}
