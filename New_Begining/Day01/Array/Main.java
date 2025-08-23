package New_Begining.Day01.Array;

import java.util.Scanner;

public class Main {
    public int secondMax(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            if(arr[i] != max && arr[i] > secondMax){
                arr[i] = secondMax;
            }
        }
        return secondMax;
    }

    public int maxVal(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public int minVal(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public int [] reverseArray(int []arr){
        int front = 0;
        int last = arr.length-1;
        while(front < last ){
            int temp = arr[front];
            arr[front] = arr[last];
            arr[last] = temp;
            front++;
            last--;
        }
        return arr;
    }

    public int[] removeEven(int []arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                count++;
            }
        }
        int [] temp = new int[count];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                temp[index] = arr[i];
                index++;
            }else{
                continue;
            }
        }
        arr = temp;
        return arr;
    }
    public void printArray(int []arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array required: ");
        int len = input.nextInt();
        int [] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = input.nextInt();
        }
        Main obj = new Main();
        obj.printArray(arr);
        System.out.println("Even numbers removed from array: ");
        int [] temp = obj.removeEven(arr);
        obj.printArray(temp);
        System.out.println("Reversed Array: ");
        obj.reverseArray(arr);
        obj.printArray(arr);

        int min = obj.minVal(arr);
        System.out.println("Minimum value in array: " + min);

        int max = obj.maxVal(arr);
        System.out.println("Maximum value in array: " + max);

        int secondMax = obj.secondMax(arr);
        System.out.println("Second maximum value in array: " + secondMax);
        input.close();
    }
}
