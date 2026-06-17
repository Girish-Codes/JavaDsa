package Strings;

import java.util.Scanner;

public class CopyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        char[] chArray = new char[str.length()];
        for (int i = 0; i < ch.length; i++) {
            chArray[i] = ch[i];
        }
        StringBuffer str2 = new StringBuffer();
        for(int i=0; i<chArray.length; i++) {
            str2.append(chArray[i]);
        }
        System.out.println(str2);
        sc.close();
        
    }
}
