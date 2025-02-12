package Day06.Matrix;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = input.nextInt();
        int col = input.nextInt();

        int [][] mat = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
