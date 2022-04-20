import java.util.Scanner;
public class Ques_Practice {
    public static void main(String[]args) {
 /*       Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();

        int flag = 1;
        for (int i=2;i<num;i++){
            if (num%i==0){
                flag = 0;
                break;
            }
        }
        if (flag==1){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }    */

        // Ques 2   ( Nth Fibonacci )

/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i=0;i<=n;i++){

            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }          */

        // Ques 3  ( LCM )

/*        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i=2;i<=n2;i++){
            if (n1%i==0 && n2%i==0) {
                System.out.println(i);
                break;
            }
        }     */

        // Ques 4  ( Print Primes )

/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int num=2;num<=n;num++) {
            int flag = 1;
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag==1) {
                System.out.println(num);
            }
        }          */

        // Ques 5   ( Count Digits )

/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            n = n/10;
            count ++;
        }
        System.out.println(count);
 */

        // Ques 6  ( Even Odd back in delhi )

/*        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            int digit = num%10;
            num = num/10;
            sum = sum + digit;
        }
        System.out.println(sum);

        if (sum%4==0 || sum%3==0){
            System.out.println("You can run on sunday");
        }
        else{
            System.out.println("You can't go");
        }      */

        // Ques 7  ( Reverse of a number )

/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n>0){
            int digit = n%10;
            ans = ans*10 + digit;
            n = n/10;
        }
        System.out.println(ans);
 */

        // Ques 8   ( Inverse a number )

/*        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = 1;
        int sum = 0;
        while (num!=0){
            int digit = num % 10;
            int value = (int)(pos*Math.pow(10,digit-1));
            sum = sum + value;
            pos++;
            num = num/10;
        }
        System.out.println(sum);
 */

        //  Pattern 1

/*        int n = 5;
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
 */

        // Pattern 2

/*        int n = 5;

        for (int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
         */

    // Pattern 3

/*        int n = 5;
        int sp = n-1;
        int st = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for (int j=1;j<=st;j++){
                System.out.print("*\t ");
            }
            sp--;
            st++;
            System.out.println( );
        }
 */

        // Pattern 4

/*        int n = 5;
        int st = n;
        int sp = 0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=sp;j++){
                System.out.print(" \t");
            }
            for (int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            st--;
            sp++;
            System.out.println();
        }
 */

        // Pattern 5

/*        int n = 5;
        int sp = n/2;
        int st = 1;

        for (int i=1;i<=n;i++){
            for (int j =1;j<=sp;j++){
                System.out.print("\t");
            }
            for (int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if (i<=n/2){
                sp--;
                st +=2;
            }
            else{
                sp++;
                st -=2;
            }
            System.out.println();
        }
 */

        // Pattern 6

/*        int n = 5;
        int st = n/2+1;
        int sp = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=st;j++){
                System.out.print("* ");
            }
            for (int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=st;j++) {
                System.out.print("* ");
            }
            if (i<=n/2){
                st--;
                sp +=2;
            }else{
                st++;
                sp -=2;
            }
            System.out.println();
        }
 */

        // Pattern 7

/*        int n = 5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==j){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
 */

        // Pattern 8

//        int n = 5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (i+j==n+1){
//                    System.out.print("* ");
//                } else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        // Pattern 9

//

        // Pattern 10

/*        int n = 5;
        int os = n/2;
        int is = -1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=os;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j=1;j<=is;j++){
                System.out.print("  ");
            }
            if (i>1 && i<n){
                System.out.print("* ");
            }
            if (i<=n/2){
                os--;
                is +=2;
            }else{
                 os++;
                 is -=2;
            }
            System.out.println();
        }
 */

/*        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int dividend = n1;
        int divisor = n2;
        int rem = dividend%divisor;
        int gcd = rem;
        int lcm = (n1*n2)/gcd;
        while ( rem !=0 ) {
            dividend = divisor;
            divisor = rem;
        }

        System.out.println(gcd);
        System.out.println(lcm);
 */

/*      int num = 44584643;
      int t = 4;
      int count = 0;
      while(num != 0){
          int digit = num%10;
           if (digit==4){
              count++;
          }
          num = num/10;
      }
        System.out.println(count);
 */

        int num = 12345;
        int nn = 0;
        int mult = 1;
        while(num>0) {
            int digit = num%10;

            nn = nn + digit *mult;
            mult = mult*10;

            System.out.println(digit+ " , "+nn);
            num=num/10;
        }

    }
}

