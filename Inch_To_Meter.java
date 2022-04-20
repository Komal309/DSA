import java.util.Scanner;

public class Inch_To_Meter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a no. for inch: ");
        double inch = sc.nextDouble();
        double meter = inch * 0.0254;
        System.out.println("The value of "+ inch + "inch into meter is: "+ meter);
    }
}
