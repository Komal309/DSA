package Revision;

import javax.naming.directory.SearchControls;

public class Binary_Search {
    public static void main(String[] args) {
        Binary_Search ob = new Binary_Search();
        int[] arr = {5,7,11,12,15,20,31,33,35,40,45,55,58,66,71};
        int x = 40;
        int n = arr.length;
        int result = ob.Search(arr,x,0,n-1);
        if(result==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at index: " + result);
        }
    }
    public static int Search(int[] arr, int ele, int i, int i1){
        int s = 0;
        int e  = arr.length-1;
        while(s<e){
            int mid = (s+e)/2;
            if (arr[mid]==ele){
                return mid;
            }else if(arr[mid]<ele){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return -1;

    }
}

