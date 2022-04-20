import java.util.Scanner;

public class Min_Into_DaysAndYears {
    public static void main(String[] args) {
        double minInYear = 60*24*365;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of minutes:");
        double min = sc.nextDouble();
        long years = (int)(min/minInYear);
        long days = (int)(min/60/24)%365;
        System.out.println(min+" minutes is approximately "+years+" years and "+days+" days long");
    }
}
