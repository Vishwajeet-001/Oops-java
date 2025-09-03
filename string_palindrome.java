import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class string_palindrome {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int st = 0;
        int end = str.length()-1;

        while(st<end) {
            if (str.charAt(st) != str.charAt(end)) {
                System.out.println("Not Palindrome");
                return;
            }
            st++;
            end--;
        }

        System.out.println("Palindrome");
    }
}
