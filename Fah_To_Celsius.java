import java.util.Scanner;

public class Fah_To_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter degree in Fahrenheit");
        double Fahrenheit = sc.nextDouble();
        double Celsius = (5.0*(Fahrenheit - 32.0)/9.0);
        System.out.println(Fahrenheit + " degree Fahrenheit is equals to : "+ Celsius+" degree in Celsius");
    }
}
