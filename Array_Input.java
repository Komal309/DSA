import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]arr = new int[size];

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(i+" ith index "+arr[i]);
        }
        for (int ele : arr){
            ele = 10;
            System.out.println(ele);
        }
    }
}
