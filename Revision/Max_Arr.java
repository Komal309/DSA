package Revision;

public class Max_Arr {
    public static void main(String[] args) {
        int[]arr = {10,20,10,2,2,99,1};
        Max(arr);
        System.out.println(find(arr,99));
        display(arr);
        rev(arr);
        display(arr);
    }
    public static void rev(int[]arr){
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
    public static void Max(int[]arr){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static int find(int[]arr,int ele){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
    public static void display(int[]arr){
        for (int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
