package org.example.leetcode;

public class Node {


    int data;
    Node next=null;
    public Node(){

    }



    public Node(int data) {
        this.data=data;
    }

    @Override
    public String toString() {
        return  "data=" + data ;
    }
}

