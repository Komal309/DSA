package Again;

public class Pat14 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = n-1;
        int nst = 1;
        int row = 1;
        while (row<=2*n-1){
            int csp = 1;
            while (csp<=nst) {
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
            if (row>=n){
                nst--;
            }else{
                nst++;
            }
            if (row>=n){
                nsp++;
            }else{
                nsp--;
            }
        }
    }
}
