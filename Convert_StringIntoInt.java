import java.util.Scanner;

public class Convert_StringIntoInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(String)");
        String str1 = sc.nextLine();
        int result = Integer.parseInt(str1);
        System.out.printf("The integer value is: %d",result);
    }
}
