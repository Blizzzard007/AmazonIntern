package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hongruzh on 3/5/16.
 */
public class rootSum {


    public int halfsum(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = inorder(root);
        int rootsum = list.get(0);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<list.size();i++){
            if(Math.abs(list.get(i)-rootsum/2)<min){
               min = Math.min(min,Math.abs(list.get(i)-rootsum/2));
                ans = list.get(i);
            }
        }
        return ans;
    }

    public ArrayList<Integer> inorder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
               while(!queue.isEmpty()){
                    TreeNode node = queue.poll();
                    int sum = rootsum(node);
                    list.add(sum);
                    if(node.left!=null){
                        queue.add(node.left);
                    }
                    if(node.right!=null){
                        queue.add(node.right);
                    }
                }
        return list;
    }



    public int rootsum(TreeNode root){
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return root.val;

        int left = rootsum(root.left);
        int right = rootsum(root.right);
        return  root.val+right+left;

    }

}
    /**
          1
        2   3
      4  5
   rootsum(1)
        left = rootsum(2)
                  root(2.left) rootsum(4) return left = 4
                  root(2.right) rootsum(5) return right = 5
               return left+right+2 = 11;
        right = rootsum(3)
                  3.left==null&&4.left==null
                  return 3
   return left+right+1 = 15

    */