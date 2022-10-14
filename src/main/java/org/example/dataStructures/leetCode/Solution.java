package org.example.dataStructures.leetCode;


public class Solution {
       public  TreeNode treeNode = null;
    public boolean findTarget(TreeNode root, int k) {
        int sum=0;
        if(root==null ){
            return false;
        }
        if (root.val==k) return true;
        if(root.left!=null){
            sum+=root.left.val ;
            if(root.left.val+root.val==k) return true;
        }
        if(root.right!=null){
            sum+=root.right.val;
            if(root.right.val+root.val==k) return true;
        }
        if(sum==k) return true;

        return findTarget(root.left,k)|| findTarget(root.right,k);
    }}
