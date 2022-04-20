package Revision;

public class RotateArray {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        rotate(arr,2);
    }
    public static void rev(int[]arr,int s,int e){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void rotate(int[]arr,int r){
        r = r% arr.length;
        if(r<0){
            r = r + arr.length;
        }
        rev(arr,0, arr.length-1-r);
        rev(arr, arr.length-r, arr.length-1 );
        rev(arr,0, arr.length-1);
        disp(arr);
    }
    public static void disp(int[]arr){
        for (int i:arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
