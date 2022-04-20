package Again;

public class Pat7 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = 0;
        int nst = n;
        int row = 1;
        while (row<=n){
            int cst = 1;
            while (cst<=nst){
                if (cst==1||cst==n ||row==1 ||row==n) {
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
    }
}
