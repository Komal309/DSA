import java.util.*;
class BostonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();       //21
        int temp = num;        //temp = 378
        int n = 2;            // n = 2
        int multiply = 0;    //multiply = 2 + 3 + 3 + 3 + 7
        while(n<=num) {       ///3 < 21  == true
            if(num%n==0) {   // 7 % 7 == 0
                int num1 = n;   //3
                int m = 2;  //m = 2
                int Prime = 0;  //Prime = 0
                if (num1 == 2){  //
                    Prime = 1;
                }
                else {
                    while (m < num1) {  ///2 < 3
                        if (num1 % m == 0) {   //
                            break;
                        } else {
                            Prime = 1;
                        }
                        m++;
                    }
                }
                if(Prime == 1) {
                    multiply += n;   // multiply += 7
                    num /= n;  // num = 7
                    n = 2;  // n = 2
                    continue;  //continue
                }
            }
            n++;
        }
        int sum = 0;
        while(temp != 0) {
            int digit = temp % 10;
            temp /= 10;
            sum += digit;
        }
        if(sum == multiply) {
            System.out.println("boston");
        }

    }
}