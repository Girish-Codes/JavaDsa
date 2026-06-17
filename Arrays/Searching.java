package Arrays;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        String key = sc.nextLine();
        boolean keyFound = false;

        for (int i = 0; i < arr.length; i++) {
            if(key.equals(arr[i])) {
                keyFound = true;
                System.out.println("The product " + "\""+key+"\""+" is found in the inventory.");
                break;
            }
        }

        if(!keyFound) System.out.println("Product Not Found.");
        sc.close();

    }
}
