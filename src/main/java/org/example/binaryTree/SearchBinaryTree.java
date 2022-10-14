package org.example.binaryTree;

public class SearchBinaryTree {
    Node root = null;


    public void insertToBinaryTree(Node node,int data){
        Node newNode = new Node(data);
         if( data> node.data) {
            if(node.right==null) {
                node.right = newNode;
            }else{
            insertToBinaryTree(node.right,data);
            }
        }else {
            if(node.left==null) {
                node.left = newNode;
            }else{
                insertToBinaryTree(node.left,data);
            }
        }
    }
    public void displayTreeAscending(Node node){
        if(node!=null){
            displayTreeAscending(node.left);
            System.out.print("->"+node.data);
            displayTreeAscending(node.right);
        }
//        return null;
    }

    public void displayTreeDescending(Node node){
        if(node!=null){
            displayTreeDescending(node.right);
            System.out.print("->"+node.data);
            displayTreeDescending(node.left);
        }
//        return null;
    }}
