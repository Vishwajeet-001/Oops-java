import java.util.Scanner;
public class reverse_array {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

         int st = 0;
         int end = arr.length-1;
        while(st<end){
            int temp = arr[end];
            arr[end] = arr[st];
            arr[st] =  temp;
            st++;
            end--;
        }

        for(int i=0; i<len; i++){
            System.out.println(arr[i]);
        }
        }
}
