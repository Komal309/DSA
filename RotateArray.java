public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
         rotate(arr,2);
    }
    public static void rev(int[]arr,int s,int e){
        int start = s;
        int end = e;
        while (s<e){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void rotate(int[]arr,int r){
        r = r% arr.length;
        if (r<0){
            r=r+ arr.length;
        }
        rev(arr,0, arr.length-1-r);
        rev(arr, arr.length-r, arr.length-1);
        rev(arr,0, arr.length-1);
    }
    public static void display(int[]arr){
        for (int i:arr){
            System.out.println(i+" ");
        }
        System.out.println();
    }
}