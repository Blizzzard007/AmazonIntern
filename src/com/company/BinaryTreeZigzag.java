package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hongruzh on 3/5/16.
 * 其实可以用递归的方法来做DFS 可以重新写一下
 */

public class BinaryTreeZigzag {
    public ArrayList<ArrayList<Integer>> LevelTraversal(TreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root==null) return result;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        /**
         list:3 result.add(list1)[1]
         queue:20,9
         list:[9,20]  queue[15,7]
         */
        while(!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left!= null) {
                    if (node.left != null) queue.offer(node.left);
                }
                if(node.right!=null){
                    if(node.right!=null) queue.offer(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
