package Day06.Matrix;

public class SpiralMatrix {
    public void print(int [][] matrix, int row, int col){
        int i = 0;
        int k = 0;
        int l = 0;
        while(i <row && l <col){
            for(i = l; i<col; i++){
                System.out.println(matrix[k][i] + " ");
            }
            k++;

            for(i = k; i<row; i++){
                System.out.println(matrix[i][col-1] + " ");
            }
            col--;
            if(k <row) {
                for (i = col - 1; i >= l; i--) {
                    System.out.println(matrix[row - 1][i] + " ");
                }
                row--;
            }
            if(l < col){
                for(i = row-1; i>=k; i--){
                    System.out.println(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        sm.print(matrix, 4,4);
    }
}
