package com.company;

import java.util.ArrayList;

/**
 * Created by hongruzh on 3/7/16.
 */
public class ConvertTreeToDoublyLinkedList {

    ArrayList<DoublyNode> list = new ArrayList<DoublyNode>();

    public void binaryTreeToList(DoublyNode root){

        if(root==null) return;
        binaryTreeToList(root.left);
        list.add(root);
        binaryTreeToList(root.right);
    }
    public void binaryTreeToDoublylist(){

        for(int i=0;i<list.size()-1;i++){
            list.get(i).right = list.get(i+1);
            //System.out.println(list.get(i).data);
        }
        for(int i=list.size()-1;i>=1;i--){
//            if(list.get(i-1)==null)
            list.get(i).left = list.get(i - 1);
        }

        for(int i=0;i<list.size();i++){
            if(list.get(i).right==null) {
                System.out.println("null");
            }
            System.out.println(list.get(i).right.data);

        }
    }


    /**
     *
     *     1
     *   2   3
     * 4  5 6 7
     *
     * f(1)
     *  f(2)
     *   f(4)
     *    f(4.left) return,
     *     4.right =
     *
     *
     *
     *
     *
     * */



//
//    public DoublyNode bintreeListUtil(DoublyNode node){
//        if(node==null) return node;
//
//        if(node.left!=null) {
//            DoublyNode left = bintreeListUtil(node.left);
//            for (; left.right != null;left=left.right);
//            left.right=node;
//            node.left=left;
//        }
//
//        if(node.right!=null){
//            DoublyNode right = bintreeListUtil(node.right);
//            for(;right.left!=null;right = right.left);
//            right.right = node;
//            node.left = right;
//        }
//        return node;
//    }



}
