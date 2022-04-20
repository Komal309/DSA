package Again;

public class Pat13 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int row = 1;
        while (row<=2*n-1){
            int cst = 1;
            while (cst<=nst) {
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
        }
    }
}
