package org.example.dataStructures;

public class Stack {// FIFO
    Node node  = null;


    public Node push(Node node , int data){
        Node newNode = new Node(data), tmp=node;
        if(node==null){
            return newNode;
        }
        newNode.next=node;
       return newNode;
    }
    public Node pop(Node node){
        if (node==null){
            return node;
        }
        return node.next;
    }


}
