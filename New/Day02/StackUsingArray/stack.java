package New.Day02.StackUsingArray;

import java.util.EmptyStackException;

public class stack {
    private ListNode top;
    private int length;

    public static class ListNode{
        private char data;
        private ListNode next;

        public ListNode(char data){
            this.data = data;
        }
    }

    public stack(){
        this.top = null;
        this.length = 0;
    }

    public int length() {return length;}

    public boolean isEmpty() {return length == 0;}

    public void push(char val){
        ListNode temp = new ListNode(val);
        temp.next = top;
        top = temp;
        length++;
    }

    public char pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        char result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public static String reverseString(String input){
        stack Stack = new stack();

        for(int i=0; i<input.length(); i++){
            Stack.push(input.charAt(i));
        }

        String reversedString = "";
        while(!Stack.isEmpty()){
            reversedString += Stack.pop();
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String original = "Hello World!";
        String reversed = reverseString(original);
        System.out.println("Original String :- " + original);
        System.out.println("Reversed String :- " + reversed);
    }
}
