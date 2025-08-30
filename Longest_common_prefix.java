import java.util.Arrays;
import java.util.Scanner;

public class Longest_common_prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = {"hey","hi","hello","he"};
        Arrays.sort(arr);
        int lenofzeroIndex = arr[0].length();
        int lenoflastIndex = arr[arr.length].length();
        int commonlen = 0;
        int len = Math.min(arr[0].length(),arr[arr.length-1].length());
        for(int i=0; i<len; i++){
            if(arr[0].charAt(i) != arr[arr.length-1].charAt(i)){
                commonlen = i;
                break;
            }
        }
        System.out.println(i);
    }
}