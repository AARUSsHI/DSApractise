package Day07.PriorityQueueAndBinaryHeap.project3;

public class MaxPQ {
    private Integer[] heap;
    private int n;

    public MaxPQ(int capacity) {
        heap = new Integer[capacity];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void insert(int x) {
        if (n == heap.length - 1) {
            resize(2 * heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    public void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2;
        }
    }

    public void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void print(){
        for(int i=1; i<=n; i++){
            System.out.println(heap[i] + " ");
        }
        System.out.println();
    }

}
