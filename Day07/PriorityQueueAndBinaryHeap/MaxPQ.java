package Day07.PriorityQueueAndBinaryHeap;

public class MaxPQ {
    private Integer[] heap;
    private int n;

    public MaxPQ(int capacity){
        heap = new Integer[capacity+1];
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public static void main(String[] args) {
        MaxPQ mp = new MaxPQ(3);
        System.out.println(mp.size());
        System.out.println(mp.isEmpty());
    }
}
