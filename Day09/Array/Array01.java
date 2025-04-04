package Day09.Array;

import java.util.Scanner;

public class Array01 {
    public int secondMax(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public int maximum(int [] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public int minimum(int [] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void reverseArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int x = arr[start];
            arr[start] = arr[end];
            arr[end] = x;
            start++;
            end--;
        }
    }

    public int[] removeEven(int [] arr){
        int cap = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                cap++;
            }
        }
        int[] temp = new int[cap];
        int indx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                temp[indx] = arr[i];
                indx++;
            }
        }
        return temp;
    }

    public void print(int[] arr){
        for(int i=0; i<arr.length; i++){
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

        System.out.println("Printing the array: ");
        Array01 obj = new Array01();
        obj.print(arr);

        System.out.println("Remove even terms");
        int[] temp = obj.removeEven(arr);
        obj.print(temp);

//        reverseArr(arr);
//        obj.print(arr);

        System.out.println(obj.minimum(arr));
        System.out.println(obj.maximum(arr));
        System.out.println(obj.secondMax(arr));

        input.close();
    }
}
