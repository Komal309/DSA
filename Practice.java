import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // Loop demo
/*        int ci = 1;
        while(ci<=5){
            System.out.println("HI");
            System.out.println(ci);
            ci++;
        }      */

        // natural sum

 /*       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = 1;
        int ans = 0;

        while(n<=num){
            ans = ans + n;
            System.out.println(n);
            n++;
        }
        System.out.println(ans);

  */

        // print prime

/*        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = 1;
        int factors = 0;
        int sum = 0;
        while (n<=num){
            if (num%n==0){
                System.out.println(n);
                factors++;
            }
            n++;
        }

        if (factors==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

 */

         // Reverse the number

/*        int num = 6193;
        int ans = 0;

        while(num != 0){
            int digit = num%10;
            num = num/10;
            ans = ans*10+digit;
        }
        System.out.println(ans);

 */

        // Fibonacci Series

/*        int n = 20;
        int i = 0;

        int a = 0;
        int b = 1;

        while (i<n){
            int c = a + b;
            System.out.println(a);

            a = b;
            b = c;
            i++;
        }    */

    // GCD

/*        int a1 = 7;
        int a2 = 49;

        int divisor = a1;
        int dividend = a2;

        while(divisor>0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(dividend);

 */

    // Pattern 1
/*        int n = 5;
        int nst = n;
        int row = 1;
        while (row<=n){
            int cst = 1;
            while (cst<=nst){
                System.out.print("*");
                cst++;
            }
            row++;
            System.out.println();
        }

 */

        // pattern 2

/*        int n = 5;
        int nst = 1;
        int row = 1;
        while(row<=n){
            int cst = 1;
            while (cst<=nst){
                System.out.print("*");
                cst++;
            }
            row++;
            System.out.println();
            nst++;
        }   */

        // Pattern 3

/*        int n = 5;
        int nst = n;
        int row = 1;
        while (row<=n){
            int cst =1;
            while (cst<=nst){
                System.out.print("*");
                cst++;
            }
            row++;
            System.out.println();
            nst--;
        }   */

        // pattern 4

/*        int n = 5;
        int nst = 1;
        int nsp = n-1;
        int row = 1;
        while (row<=n){
            int csp = 1;
            while (csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while (cst<=nst){
                System.out.print("*");
                cst++;
            }
            row++;
            System.out.println();
            nsp--;
            nst++;
        }     */

        // Pattern 5

/*        int n = 5;
        int nsp = 0;
        int nst = n;
        int row = 1;
        while(row<=n){
            int csp = 1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while (cst<=nst){
                System.out.print("*");
                cst++;
            }
            row++;
            System.out.println();
            nsp++;
            nst--;
        }       */

        // Pattern 6

/*        int n = 5;
        int nsp = 0;
        int nst = n;
        int row = 1;
        while (row<=n){
            int csp = 1;
            while (csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }
            row++;
            System.out.println();
            nsp += 2;
            nst--;
        }

 */

        // Pattern 7

/*        int n = 5;
        int nst = n;
        int row = 1;
        while(row<=n){
            int cst = 1;
            while(cst<=nst){
                if (cst == 1 || cst == n || row == 1 || row == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                cst++;
            }
            row++;
            System.out.println();
        }

 */

        // extra digit

/*        int num = 12345;
        int nn = 0;
        int mult = 1;
        while (num>0){
            int digit = num % 10;
            nn = nn + digit * mult;
            mult = mult * 10;
            System.out.println(digit+","+nn);
            num = num/10;
        }

 */

        // Patterns using For loop

        // 1. Right triangle

//        int row = 5;
//        for (int i=1;i<=row;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // 2. Left triangle

/*        int row = 5;
        for (int i=1;i<=row;i++){
            for (int j =(row - i);j>0; j--){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/
        // OR
/*        int n = 5;
        for (int i=0;i<n;i++){
            for (int j=(n-i)*2;j>=0;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }    */
        // Apna College  1. Solid rectangle

/*        int n = 4;
        int m =5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

 */
        // 2. Hollow rectangle

/*        int n = 4;
        int m = 5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if (i==1||j==1||i==n||j==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        */

        // 3. Half pyramid

/*        int n = 4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }     */

        // 4. Inverted half pyramid

/*        int n = 4;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }       */

        // 5. Inverted half pyramid rotated by 180 degree

/*        int n = 4;
        for (int i=1;i<=n;i++){
            for (int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }          */

        // 6. Half pyramids with numbers

 /*       int n = 5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }      */

        // Inverted half pyramid with numbers

/*        int n = 5;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }     */
         // OR
/*        int n =5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }             */

        // 8. Floyd's triangle

        int n = 5;
        int num = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }









    }
}
