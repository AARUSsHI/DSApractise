package New.Day02.Stack;

import java.util.EmptyStackException;

public class stack {
    private ListNode top;
    private int length;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public stack(){
        top = null;
        length = 0;
    }

    private int length() {return length;}

    private boolean isEmpty() {return length == 0;}

    public void push(int val){
        ListNode temp = new ListNode(val);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;        
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        stack Stack = new stack();
        Stack.push(10);
        Stack.push(15);
        Stack.push(20);

        System.out.println("Lenght of stack: " + Stack.length());

        System.out.println("Peak : " + Stack.peek());
        Stack.pop();
        System.out.println("peek : " + Stack.peek());
    }
    
}
