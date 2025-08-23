package New_Begining.Day02.Array;

import java.util.Scanner;

public class Main {
    public int [] resize(int []arr, int n){
        int [] arrNew = new int[n];
        for(int i=0; i<arr.length; i++){
            arrNew[i] = arr[i];
        }
        arr = arrNew;
        return arr;
    }

    public static void moveZero(int [] arr){
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
    public void printArr(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();

        int [] arr = new int[len];
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        Main obj = new Main();
        System.out.println("Original Array: ");
        obj.printArr(arr);

        System.out.println("Zeroes moved to the end: ");
        moveZero(arr);
        obj.printArr(arr);

        input.close();
    }
}
