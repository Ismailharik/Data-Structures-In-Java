package org.example.dataStructures;

public class DoubleLinkedList {
    // Mention that  : for making Stack FIFO with double linked list you should use addStart with deleteEnd or the inverse
    // Mention that  : for making Heap LIFO ( Pile in French ) with double linked list you
    // should use addStart with deleteStart or addEnd with deleteEnd
     ListD listD = new ListD();



    public void addStart(ListD listD, int data){ //Heap (Pile in French) -->stuck
        DNode newDNode = new DNode(data),tmp=listD.start;
        if(listD.start==null){//||listD.start==null
            listD.start=listD.end=newDNode;
        }else {
            newDNode.next = listD.start;
            listD.start.prev=newDNode;
            listD.start=newDNode;
        }

    }
    public void addEnd(ListD listD, int data){ //Heap (Pile in French) -->stuck
        DNode newDNode = new DNode(data),tmp=listD.start;
        if(listD.start==null){//||listD.start==null
             listD.start=listD.end=newDNode;
        }else {
            newDNode.prev = listD.end;
            listD.end.next=newDNode;
            listD.end=newDNode;
        }

    }
    public void displayEnd(ListD listD){
        DNode  tmp= listD.end;
        while(tmp!=null){
            System.out.println(tmp.data);
            tmp=tmp.prev;
        }
    }
    public void displayStart(ListD listD){
        DNode  tmp= listD.start;
        while(tmp!=null){
            System.out.println(tmp.data);
            tmp=tmp.next;
        }
    }
    public void deleteStart(ListD listD){
        if (listD!=null&&listD.start!=null){
            listD.start=listD.start.next;
            listD.start.prev=null;
        }
    }
    public void deleteEnd(ListD listD){
        if (listD!=null&&listD.end!=null){
            listD.end=listD.end.prev;
            listD.start.next=null;
        }
    }

}
class ListD{
    DNode start=null;// take the first element of the list
    DNode end =null;// take the last element of the list

}