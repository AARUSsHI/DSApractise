package Day08.Project02;

public class BinarySearch {
    public int search(int [] nums, int x){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == x){
                return mid;
            }else if(x < nums[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1,10,20,47,59,65,75,88,99};
        System.out.println(bs.search(nums, 88));
    }
}
