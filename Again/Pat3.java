package Again;

public class Pat3 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int row = 1;
        while (row<=n) {
            int cst = 1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }
            row++;
            System.out.println();
            nst--;
        }
    }
}

