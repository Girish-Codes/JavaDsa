package Arrays;

import java.util.Scanner;

public class StoringDataInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];
        System.out.println("Enter The Ages Of Participants: ");
        for(int i=0; i<ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        System.out.println("Ages Of The Participants are: ");
        for(int i : ages) {
            System.out.println(i);
        }
        sc.close();
    }
    
}
