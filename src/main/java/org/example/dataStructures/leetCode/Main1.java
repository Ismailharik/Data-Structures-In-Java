package org.example.dataStructures.leetCode;


public class Main1 {
    public  static void main(String[] args) {

        Solution solution = new Solution();
        solution.treeNode=new TreeNode(15);
        solution.treeNode.left = new TreeNode(10);
        solution.treeNode.right = new TreeNode(20);
        solution.treeNode.left.left = new TreeNode(8);
        solution.treeNode.right.right = new TreeNode(12);

        solution.treeNode.right.left = new TreeNode(16);
        solution.treeNode.right.right = new TreeNode(25);

        System.out.println(solution.findTarget(solution.treeNode,18));
    }

}
