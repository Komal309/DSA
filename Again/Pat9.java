package Again;

public class Pat9 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = n-1;
        int nst = 1;
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
            int ccst = 1;
            while (ccst<nst){
                System.out.print("* ");
                ccst++;
            }
            row++;
            System.out.println();
            nsp--;
            nst++;
        }
    }
}
