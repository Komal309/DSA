package Preparation;

public class Reverse_String {
    public void reverseString(char[] s) {

        int temp;
        int left = 0;
        int right = s.length-1;
        while(left<=right){
            temp = s[left];
            s[left] = s[right];
            s[right] = (char) temp;
            left++;
            right--;
        }
    }
    public void printString(char[] s){
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+"");
        }
        System.out.println();
    }
    public  void main (String[]args){
        String s = "Hello";
        char[]a = s.toCharArray();
        printString(a);
        reverseString(a);
        System.out.print("Reverse of String");
        printString(a);
    }

}
