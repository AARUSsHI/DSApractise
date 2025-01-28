package Day02.Array;
import java.util.Scanner;
public class Main {
    public int[] removeEven(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        int index = 0;
        int[] result = new int[count];
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2  != 0){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
    public void display(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        Main obj = new Main();
        System.out.println("Original printed array");
        obj.display(arr);
        System.out.println("only the odd terms: ");
        int[] result = obj.removeEven(arr);
        obj.display(result);
        input.close();
    }
}
