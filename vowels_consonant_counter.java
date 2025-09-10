import java.util.Scanner;

public class vowels_consonant_counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = sc.nextLine();


        int vowels = 0;
        int consonants;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'i' ||
            str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){

                vowels++;

            }
        }
        System.out.println("No of vowels are:" + vowels);
        consonants = str.length()-vowels;
        System.out.println("No of consonants are:" + consonants);


    }
}
