package New.Day02.DoublyLinkedList;

import java.util.NoSuchElementException;

public class linkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public static class ListNode{
        private ListNode prev;
        private int data;
        private ListNode next;

        public ListNode (int data) {this.data = data;}
    }
    public linkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() { return length == 0;}

    public int length() {return length;}

    public ListNode deletePos(int pos){
        int count = 1;
        ListNode current = head;
        while(current != null && count < pos-1){
            current = current.next;
        }
        ListNode next = current.next;
        current.next = next.next;
        next.next.prev = current;
        next.prev = null;
        next.next = null;
        return next;
    }

    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode current = head;
        if(head == tail){
            tail = null;
        }else{
            head.next.prev = null;
        }
        head = head.next;
        current.next = null;
        length--;
        return current;
    }

    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode current = tail;
        if(tail == head){
            head = null;
        }else{
            tail.prev.next = null;
        }
        tail = tail.prev;
        current.prev = null;
        length--;
        return current;
    }

    public void insertFirst(int val){
        ListNode newNode = new ListNode(val);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int val){
        ListNode newNode =  new ListNode(val);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        length++;
    }

    public void displayForward(){
        if(head == null){
            return;
        }
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void displayBackward(){
        if(tail == null){
            return;
        }
        ListNode current = tail;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.prev;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        System.out.println("Forward: ");
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(30);

        ll.displayForward();

        // System.out.println("Backward: ");
        // ll.insertLast(11);
        // ll.insertLast(22);
        // ll.insertLast(33);

        // ll.displayBackward();

        System.out.println(ll.deletePos(2).data);
        ll.displayForward();
    }
}
