package Again;

public class Pat10 {
    public static void main(String[] args) {
        int n = 5;
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
            int ccst = 1;
            while (ccst<nst){
                System.out.print("* ");
                ccst++;
            }
            row++;
            System.out.println();
            nsp++;
            nst--;
        }
    }
}
