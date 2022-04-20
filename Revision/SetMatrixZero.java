package Revision;

public class SetMatrixZero {
    public static void main(String[] args) {
        int arr[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(arr);
//        System.out.println("The Final Matrix is ");

    }
    public static void setZeroes(int[][]matrix){
        int rows = matrix.length , cols = matrix[0].length;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (matrix[i][j]==0){
                    int idx = i-1;
                    while (idx>=0){
                        if (matrix[idx][j] != 0){
                            matrix[idx][j] = -1;
                        }
                        idx--;
                    }
                    idx = i + 1;
                    while (idx<rows){
                        if (matrix[idx][j] != 0){
                            matrix[idx][j] = -1;
                        }
                        idx++;
                    }
                    idx = j-1;
                    while (idx>=0){
                        if (matrix[i][idx] != 0){
                            matrix[i][idx] = -1;
                        }
                        idx--;
                    }
                    idx = j+1;
                    while (idx<cols){
                        if (matrix[i][idx] != 0){
                            matrix[i][idx] = -1;
                        }
                        idx++;
                    }
                }
            }
        }
//        for (int i = 0;i<rows;i++){
//            for (int j=0;j<cols;j++){
//                if (matrix[i][j]<=0){
//                    matrix[i][j]=0;
//                }
//            }
//        }
    }

}
