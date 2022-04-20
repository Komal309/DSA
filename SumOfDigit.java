import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("The sum of digits is:" + sum);
    }
}
