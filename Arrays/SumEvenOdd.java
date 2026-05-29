package Arrays;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        if(!sc.hasNextInt()) {
            return;
        }

        String inputLine = sc.nextLine().trim();
        String[] tokens = inputLine.split("\\s");
        int numbers[] = new int[tokens.length];
        for(int i=0; i<tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }

        for(int num : numbers) {
            if(num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}