import java.util.Scanner;

public class IncreasingNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n",n,n,n,n,n,n);
    }
}
