package SinglyLinkedList.Project01.project02;

public class singlyLinkedList {
    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            next = null;
        }
    }

    public ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public void display(ListNode head){
        ListNode current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
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

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        singlyLinkedList sll = new singlyLinkedList();

        sll.insertLast(10);
        sll.insertLast(11);
        sll.insertLast(1);
        sll.insertLast(8);
        sll.insertLast(23);

        sll.display();

        ListNode reversedHead = sll.reverse(sll.head);
        sll.display(reversedHead);       
    }
}
