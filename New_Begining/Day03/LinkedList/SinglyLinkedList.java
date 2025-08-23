package New_Begining.Day03.LinkedList;

public class SinglyLinkedList {
    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        } 
        return count;
    }

    public void insertFirst(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
    }

    public void insertLast(int value){
        ListNode node = new ListNode(value);
        if(head == null){
            head = node;
            return ;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    public void insert(int val, int n){
        ListNode node = new ListNode(val);
        if(n == 1){
            node.next = head;
            head = node;
        }else{
        ListNode previous = head;
        int count = 1;
        while(count < n-1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = node;
        node.next = current;
    }
    }

    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode current = head;
        head = current.next;
        current.next = null;
        return current;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertLast(10);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.display();

        sll.insert(3, 2);
        sll.display();

        sll.deleteFirst();
        

        sll.display();
        System.out.println("the length is: " + sll.length());
    }
}
