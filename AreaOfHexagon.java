import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side");
        int s = sc.nextInt();
        System.out.println((6*s*s)/(4*Math.tan(Math.PI/6)));
    }
}
