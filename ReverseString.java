import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        char[]letters = sc.nextLine().toCharArray();
        System.out.println("Reverse String");
        for(int i = letters.length-1; i>=0; i--){
            System.out.print(letters[i]);
        }
    }
}
