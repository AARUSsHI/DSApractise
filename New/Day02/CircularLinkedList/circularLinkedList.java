package New.Day02.CircularLinkedList;

import java.util.NoSuchElementException;

public class circularLinkedList {
    private ListNode last;
    private int length;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }
    public circularLinkedList(){
        last = null;
        length = 0;
    }

    public int length() {return length;}

    public boolean isEmpty() {return length==0;}

    public void display(){
        if(last == null){
            return;
        }
        ListNode current = last.next;
        while(current != last){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public void insertFirst(int val){
        ListNode newNode = new ListNode(val);
        if(last == null){
            last = newNode;
        }else{
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public void insertLast(int val){
        ListNode temp = new ListNode(val);
        if(last == null){
            last = temp;
            last.next = last;
        }else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public ListNode removeFirst(){
        ListNode current = last.next;
        if(isEmpty()){
            throw new NoSuchElementException();
        }else if(last.next == null){
            return last;
        }else{
            last.next = current.next;
            current.next = null;
            length--;
        }
        return current;
    }

    public static void main(String[] args) {
        circularLinkedList cll = new circularLinkedList();
        cll.insertFirst(10);
        cll.insertFirst(20);
        cll.insertLast(30);

        cll.display();

        cll.removeFirst();
        cll.display();
    }
}
