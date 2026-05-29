package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read and parse the first array
        int[] array1 = parseInputArray(scanner.nextLine());

        // 2. Read and parse the second array
        int[] array2 = parseInputArray(scanner.nextLine());

        // 3. Merge both arrays into a third array
        int[] mergedArray = new int[array1.length + array2.length];
        
        // Copy elements from array1
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        // Copy elements from array2
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        // 4. Find the minimum and maximum values without reordering the merged array
        int min = mergedArray[0];
        int max = mergedArray[0];

        for (int i = 1; i < mergedArray.length; i++) {
            if (mergedArray[i] < min) {
                min = mergedArray[i];
            }
            if (mergedArray[i] > max) {
                max = mergedArray[i];
            }
        }

        // 5. Print the expected outputs
        System.out.println("\nMerged Array: " + Arrays.toString(mergedArray));
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);

        scanner.close();
    }

    /**
     * Helper method to convert a space-separated string line into an int array.
     */
    private static int[] parseInputArray(String input) {
        // Trim and split by one or more spaces
        String[] tokens = input.trim().split("\\s+");
        int[] array = new int[tokens.length];
        
        for (int i = 0; i < tokens.length; i++) {
            array[i] = Integer.parseInt(tokens[i]);
        }
        return array;
    }
}