package org.example.problemSolving;

import java.util.Scanner;

public class Parentheses {


    public static void main(String[] argh) {
        Node stack =null;
        Scanner sc = new Scanner(System.in);
        boolean tmp=false;
        String word;
        while (sc.hasNext()) {
            String input = sc.next();
            char inputChar=input.charAt(0);
            char lastEelement;
            stack = push(stack, inputChar);
            for (int i = 1; i < input.length(); i++) {
                lastEelement= getLastElement(stack);
                inputChar=input.charAt(i);

                if (    lastEelement == '(' && inputChar==')'||
                        lastEelement == '[' && inputChar==']' ||
                        lastEelement == '{' && inputChar=='}'
                ) {
                   // System.out.println("popped - "+ lastEelement);
                    stack=pop(stack);
                } else {
                   // System.out.println("pushed - "+ lastEelement);
                    stack=push(stack, inputChar);
                }
            }


            //Complete the code
            // stack.data
            System.out.println(stack==null);
            stack=null;
        }
    }





 public static Node push(Node stack ,char data){

        Node newNode = new Node(data),tmp=stack;
        if(tmp==null) return newNode;
        else if(tmp.next==null) tmp.next =newNode;
         else push(tmp.next,data);
        return stack;
    }
    public static char getLastElement(Node stack){
        char deletedChar;
        if(stack==null) return ' ';
        while(stack.next!=null){
            stack=stack.next;
        }
        return stack.data;
    }
    public static Node pop(Node stack){
        Node tmp =stack;
        if(stack==null || stack.next==null){
//            System.out.println("pile vide");
            return null;
        }
        while(stack.next.next!=null){
            stack=stack.next;
        }
        stack.next=null;
        return tmp;
    }
}




class Node {
    char data;
    Node next=null;
    public Node(char data){  this.data = data;}
    public Node(){}
}
