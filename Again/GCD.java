package Again;

public class GCD {
    public static void main(String[] args) {
        int a1 = 15;
        int a2 = 500;

        int divisor = a1;
        int dividend = a2;

        while(divisor>0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(dividend);
    }
}
