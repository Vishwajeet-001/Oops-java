import java.util.Scanner;

public class string_to_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);
           if(ch>='a'&&ch<='z'){
               ch = (char) (ch-32);
               sb.append(ch);
           }
           else{
               sb.append(ch);
           }
        }
        System.out.println(sb);

    }
}
