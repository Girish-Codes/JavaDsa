package Strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer revString = new StringBuffer(str);
        System.out.println(revString.reverse());
        sc.close();
    }
}
