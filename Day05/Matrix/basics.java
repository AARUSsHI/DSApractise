package Day05.Matrix;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the value of row");
        int row = input.nextInt();
        System.out.println("Input the value of column");
        int col = input.nextInt();

        int[][] Matrix = new int[row][col];

        System.out.println("Input the elements of the matrix");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++) {
                Matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Print the Matrix");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
