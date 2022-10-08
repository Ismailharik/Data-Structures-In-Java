package org.example.leetcode;


public class Heap {//Pile in French
     Node node;

    //empiler
    public Node stack(Node node, int data){
        Node newNode = new Node(data),tmp = node; // allocate memory
        if(node==null){
            return newNode;
        }
        while ( tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next=newNode;

        return node;
    }
    public Node unstack(Node node){
        Node tmp = node;
        if(node==null || node.next==null){
            return null;
        }
        while (tmp.next.next!=null){
            tmp = tmp.next;
        }
        tmp.next= tmp.next.next;
        return node;
    }

}
