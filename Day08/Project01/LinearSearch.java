package Day08.Project01;

public class LinearSearch {
    public int search(int [] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5,1,9,2,10,15,20};
        LinearSearch ls = new LinearSearch();
        int search = ls.search(arr, 10);
        System.out.println(search);
    }
}
