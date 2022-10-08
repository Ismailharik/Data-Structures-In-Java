package org.example.leetcode;

import org.example.leetcode.Heap;

import org.example.leetcode.Stack;


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
        linkedList.displayNodes(stack.node);
        stack.node = stack.pop(stack.node);
        System.out.println("AFTER POP FROM THE STACK");
        linkedList.displayNodesRecursively(stack.node);

    }

}
