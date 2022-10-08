package org.example.leetcode;


public class Main {
    public  static void main(String[] args) {
        // Linked
        LinkedList linkedList= new LinkedList();
        linkedList.node=linkedList.addNode(linkedList.node,1);
        linkedList.node=linkedList.addNode(linkedList.node,2);
        linkedList.node=linkedList.addNode(linkedList.node,3);
        linkedList.node=linkedList.addNode(linkedList.node,4);
        linkedList.node=linkedList.addNode(linkedList.node,5);
//        linkedList.displayNodes(linkedList.node);
//        System.out.println("==============>> REMOVING DATA FROM Linked List");
//        linkedList.removeNode(linkedList.node,4);
//        linkedList.displayNodes(linkedList.node);
//        System.out.println("==============>> DISPLAY DATA FROM Linked List RECURSIVELY");
//        linkedList.displayNodesRecursively(linkedList.node);


        //Heap
        Heap heap = new Heap();
        heap.node = heap.stack(heap.node,1);
        heap.node = heap.stack(heap.node,2);
        heap.node = heap.stack(heap.node,3);
        heap.node = heap.stack(heap.node,4);
//        linkedList.displayNodes(heap.node);
//        heap.node=heap.unstack(heap.node);
//        System.out.println("==============>> REMOVING DATA FROM Linked List");
//        linkedList.displayNodesRecursively(heap.node);


        Stack stack= new Stack();
        stack.node = stack.push(stack.node,1);
        stack.node = stack.push(stack.node,2);
        stack.node = stack.push(stack.node,3);
        stack.node = stack.push(stack.node,4);
//        linkedList.displayNodes(stack.node);
//        stack.node = stack.pop(stack.node);
//        System.out.println("AFTER POP FROM THE STACK");
//        linkedList.displayNodesRecursively(stack.node);
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        System.out.println("ADD IN THE BEGIN");
        doubleLinkedList.addStart(doubleLinkedList.listD, 1);
        doubleLinkedList.addStart(doubleLinkedList.listD, 2);
        doubleLinkedList.addStart(doubleLinkedList.listD, 3);
        //each new number will be added in Beginning of the list like it's the first One :  3 -> 2 ->1
        System.out.println("ADD IN THE END");
        doubleLinkedList.addEnd(doubleLinkedList.listD, 4);
        doubleLinkedList.addEnd(doubleLinkedList.listD, 5);
        doubleLinkedList.addEnd(doubleLinkedList.listD, 6);
        //each new number will be added in the end of the list :  3 -> 2 ->1 4 -> 5 -> 6
        //System.out.println(doubleLinkedList.listD.end.prev.data);
        System.out.println("DISPLAY DATA FROM THE END ");
        doubleLinkedList.displayEnd(doubleLinkedList.listD);

        System.out.println("DISPLAY DATA FROM THE BEGIN");
        doubleLinkedList.displayStart(doubleLinkedList.listD);

        System.out.println("DELETE DATA FROM THE BEGIN");
        doubleLinkedList.deleteStart(doubleLinkedList.listD);
        doubleLinkedList.displayStart(doubleLinkedList.listD);

        System.out.println(" DELETE DATA FROM THE END");
        doubleLinkedList.deleteEnd(doubleLinkedList.listD);
        doubleLinkedList.displayStart(doubleLinkedList.listD);

//        doubleLinkedList.displayStart(doubleLinkedList.dNode.);

    }

}
