package org.example.dataStructures;

public class LinkedList {
        public Node node;
    public  Node addNode(Node head,int data){
        Node newNode = new Node(data);
        Node tmp=head;
        if(head==null){
            return newNode;
        }
        while(tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next = newNode;
        return head;
    }
    public  void removeNode(Node node,int data){
        while(node!=null&&node.next!=null &&node.next.data!=data){
            node = node.next;
        }
        if(node!=null&&node.next!=null &&node.next.data==data){
            node.next = node.next.next;
        }

    }
    public  void displayNodes(Node node){
        while(node!=null ){

            System.out.println(node.data);
            node = node.next;
        }
    }
    public void displayNodesRecursively(Node node){
        if(node.next!=null){
            displayNodesRecursively(node.next);
        }
        System.out.println(node.data);
    }

}
