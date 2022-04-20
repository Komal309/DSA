package Revision;

public class Inv_Arr {
    public static void main(String[] args) {

        int[] arr= {2,4,3,1,0};
        disp(inv(arr));
    }

    public static int[] inv(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
//		for copy!!
//		ans[i] = arr[i];

            int ele = arr[i];
            int pos = i;
            ans[ele] = pos;
            ans[arr[i]] = i;
        }
        return ans;
    }

    public static void disp(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
