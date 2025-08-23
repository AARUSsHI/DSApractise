package New_Begining.Day04.LinkedList;

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

    public void insertLast(int val){
        ListNode node = new ListNode(val);
        if(head == null){
            head = node;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    public void insert(int val, int n){
        ListNode node = new ListNode(val);
        int count = 1;
        ListNode previous = head;
        while(count < n-1){
            previous = previous.next;
            count++;
        }
        node.next = previous.next;
        previous.next = node;
    }

    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void delete(int n){
        int count = 1;
        ListNode previous = head;
        while(count < n-1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = current.next;
        current.next = null;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertLast(10);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.insertLast(11);
        sll.insert(3, 3);

        sll.delete(3);
        sll.display();
    }
}
