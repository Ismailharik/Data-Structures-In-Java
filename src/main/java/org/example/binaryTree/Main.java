package org.example.binaryTree;

public class Main {
    public static void main(String[] args) {
        SearchBinaryTree searchBinaryTree = new SearchBinaryTree();
        searchBinaryTree.root = new Node(8);
        searchBinaryTree.insertToBinaryTree(searchBinaryTree.root, 3);
        searchBinaryTree.insertToBinaryTree(searchBinaryTree.root, 1);
        searchBinaryTree.insertToBinaryTree(searchBinaryTree.root, 6);
        searchBinaryTree.insertToBinaryTree(searchBinaryTree.root, 7);
        searchBinaryTree.insertToBinaryTree(searchBinaryTree.root, 10);
        searchBinaryTree.insertToBinaryTree(searchBinaryTree.root, 14);
        searchBinaryTree.insertToBinaryTree(searchBinaryTree.root, 4);

        System.out.println("DISPLAY DATA ASCENDING");
        searchBinaryTree.displayTreeAscending(searchBinaryTree.root);
        System.out.println("\nDISPLAY DATA DESCENDING");
        searchBinaryTree.displayTreeDescending(searchBinaryTree.root);
    }


}
