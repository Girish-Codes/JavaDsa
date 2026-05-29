package Arrays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int array[] = new int[size];
        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }

        int remove = sc.nextInt();
        int count = removeElement(array,remove);
        System.out.println(count);
        sc.close();
    }

    public static int removeElement(int array[], int remove) {
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] != remove) {
                array[count] = array[i];
                count++;
            }
        }
        return count;
    }
}
