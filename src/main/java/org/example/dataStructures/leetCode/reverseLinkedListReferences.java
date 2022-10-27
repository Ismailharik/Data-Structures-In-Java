package org.example.dataStructures.leetCode;

import org.example.dataStructures.LinkedList;
import org.example.dataStructures.Node;

public class reverseLinkedListReferences {


    public static void main(String[] args) {
        LinkedList ls= new LinkedList();
        LinkedList linkedList= new LinkedList();
        linkedList.node=linkedList.addNode(linkedList.node,1);
        linkedList.node=linkedList.addNode(linkedList.node,2);
        linkedList.node=linkedList.addNode(linkedList.node,3);
        linkedList.node=linkedList.addNode(linkedList.node,4);
        linkedList.node=linkedList.addNode(linkedList.node,5);

            linkedList.displayNodes(linkedList.node);
//        System.out.println(linkedList.node.next.next.next.next.next);

    }
    public static Node reverseList(Node head){
        Node actualNode,nextNode,catchList;
        if(head==null || head.next==null){
            return head;
        }else {


            //initialize variables
            actualNode = head;
            nextNode = head.next;
            catchList = head.next.next;

            nextNode.next = actualNode;// next of the next of the head gonna be the head
            actualNode.next = null;// next of the head gonna be null
            while (catchList != null) {
                actualNode = nextNode;  // shift elements (actual gonna be  the next , next gonna be the next of the next ...
                nextNode = catchList;
                catchList = catchList.next;

                nextNode.next = actualNode;

            }
            return nextNode;
        }
    }
}
