package Revision;

public class Rotate_Num {
    public static void main(String[] args) {
        int num = 123456;
        int r = 40;

        int n = num;
        int nod = 0;

        while(n>0){
            n = n/10;
            nod++;
        }
//        System.out.println(nod);
        r = r % nod;
        System.out.println(r);

        while (r>0){
            int digit = num%10;
            num = num/10;
            num = (int)(digit*Math.pow(10, nod-1) + num);
            r--;
        }
        System.out.println(num);
    }
}
