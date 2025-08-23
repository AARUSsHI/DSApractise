package Project02;
import java.util.Scanner;

public class Main {
    public int[] removeEven(int[] arr){
        int count = 0;
        int ind = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        int[] newArr = new int[count];
        for(int i=0 ;i<arr.length; i++){
            if(arr[i]  % 2 != 0){
               newArr[ind] = arr[i];
                ind++;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];

        for(int i=0; i<len; i++){
            arr[i] = input.nextInt();
        }

        int [] array = obj.removeEven(arr);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        input.close();
    }
    
}
