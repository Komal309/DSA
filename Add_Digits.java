import java.util.Scanner;

public class Add_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number:");
        int n = sc.nextInt();
        int firstNumber = n%10 ;
        int remainingNumber = n/10;
        int secondNumber = remainingNumber%10;
        remainingNumber = remainingNumber/10;
        int thirdNumber = remainingNumber%10;
        remainingNumber = remainingNumber/10;
        int fourthNumber = remainingNumber%10;
        int sum = thirdNumber + secondNumber + firstNumber + fourthNumber;
        System.out.println("The sum of "+ n + " is "+sum);
    }
}
