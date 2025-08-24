package SinglyLinkedList.Project01;

public class singlyLinkedList {
    public ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            next = null;
        }
    }

    public int length(){
        if(head == null){
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertBegining(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            newNode = head;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int val, int n){
        ListNode newNode = new ListNode(val);
        int count = 1;
        ListNode current = head;
        while(count < n-1){
            current = current.next;
            count++;
        }
        newNode.next = current.next;
        current.next = newNode; 
    }

    public ListNode deleteFirst(){
        ListNode current = head;
        head = current.next;
        current.next = null;
        return current;
    }

    public ListNode deleteLast(){
        ListNode current = head;
        while(current.next.next != null){
            current = current.next;
        }
        ListNode deleted = current.next;
        current.next = null;
        return deleted;
    }

    public void delete(int n){
        ListNode current = head;
        int count = 1;
        while(count < n-1){
            current = current.next;
            count++;
        }
        current.next = current.next.next;
    }

    public boolean find(ListNode head, int key){
        ListNode current = head;
        while(current != null){
            if(current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    public void display(){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
        // sll.head = new ListNode(10);
        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(8);
        // ListNode fourth = new ListNode(11);

        // sll.head.next = second;
        // second.next = third;
        // third.next = fourth;

        sll.insertBegining(10);
        sll.insertBegining(8);
        sll.insertBegining(1);
        sll.insertBegining(11);

        sll.insertEnd(15);

        sll.insert(23, 3);

        // ListNode node = sll.deleteLast();
        // System.out.println("Deleted Node : " + node.data);

        // sll.delete(3);

        sll.display();
        System.out.println("Length of linked list : " + sll.length());

        System.out.println(sll.find(sll.head, 8));
    }
}
