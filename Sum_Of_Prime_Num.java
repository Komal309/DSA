
import java.util.Scanner;

public class Sum_Of_Prime_Num {
    public static void main(String[] args) {

/*        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        boolean isPrime = true;
        for (int i=1;i<100;i++){
            if (isPrime(i)){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int x){
        int num_of_factors = 2;
        for (int n =1;n<=x;n++){
            if (x%n==0){
                num_of_factors++;
            }
        }
        if (num_of_factors==2){
            return true;
        }
        else{
            return false;
        }

 */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i=1;i<100;i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static Boolean isPrime(int x) {
        int num_of_factors = 2;
        for (int n = 1; n <= x; n++) {
            if (x % n == 0) {
                num_of_factors++;
            }
        }
        if (num_of_factors == 2) {
            return true;
        } else {
            return false;
        }
    }
}

