package org.example.dataStructures;

public class Node {


    public int data;
    public Node next=null;
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

