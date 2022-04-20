
import java.util.Scanner;
public class ComparingTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2");
        int n2 = sc.nextInt();
        if(n1==n2) {
            System.out.println(n1 + "==" + n2);
        }
            if(n1!=n2){
            System.out.println(n1+"!="+n2);
            }
        if(n1>n2){
            System.out.println(n1+">"+n2);
        }
        if(n1<n2){
            System.out.println(n1+"<"+n2);
        }
        if(n1>=n2){
            System.out.println(n1+">="+n2);
        }
        if(n1<=n2) {
            System.out.println(n1 + "<=" + n2);
        }
    }
}
