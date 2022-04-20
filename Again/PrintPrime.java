package Again;
import java.util.Scanner;
public class PrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            int count = 0;
            for (int j = 2;j<i;j++){
                if (i%j==0){
                    count = 1;
                    break;
                }
            }
            if (count==0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("Sum is: "+sum);
    }
}
