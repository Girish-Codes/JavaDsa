package Arrays;

import java.util.Scanner;

public class StringBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();    
        String[] strArray = new String[size];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = sc.next();
        }
        String key = sc.next();
        int res = binarySearch(strArray, key);
        if(res > 0) {
            System.out.println(key+" is found.");
        } else {
            System.out.println(key+" isn't found.");
        }
        sc.close();
    }

    public static int binarySearch(String strArrString[], String key) {
        int left = 0;
        int right = strArrString.length -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(strArrString[mid].equals(key)) {
                return 1;
            } else if(key.compareTo(strArrString[mid]) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
