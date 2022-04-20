package Again;

public class Fib {
    public static void main(String[] args) {
            int n = 20;
            int i = 0;

            int a = 0;
            int b = 1;
            while(n>i){
                int c = a + b;
                System.out.println(a);

                a = b;
                b = c;

                i++;
            }
    }
}
