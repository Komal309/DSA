package Preparation;

import java.util.Scanner;

public class PrintIncRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
    public static void printIncreasing(int n){
        if (n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
