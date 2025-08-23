package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void printArray(int [] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = input.nextInt();

        int [] arr = new int[len];
        System.out.println("Enter the elements of the array");

        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Printing array : " + Arrays.toString(arr));

        System.out.println("Length of array : " + arr.length);

        obj.printArray(arr);
        input.close();
        
    }
}
