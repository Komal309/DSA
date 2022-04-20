package Revision;

public class Eng_Ruler {
    public static void main(String[] args) {

        Eng_Create(4,3);

    }
    public static void Eng_Create(int major,int len){
        for (int l = 0;l<len;l++){
            for (int i=1;i<=major;i++){
                System.out.print("-");
            }
            System.out.println(l);
            P(major-1);
        }
        for (int i=1;i<=major;i++) {
            System.out.print("-");
        }
        System.out.println(len);
    }
    public static void P(int tic){
        if(tic==0){
            return;
        }
        P(tic-1);
        for(int i=1;i<=tic;i++){
            System.out.print("-");
        }
        System.out.println();
        P(tic-1);
    }
}
