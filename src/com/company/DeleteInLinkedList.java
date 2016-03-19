package com.company;

/**
 * Created by hongruzh on 3/6/16.
 */
public class DeleteInLinkedList {
    public void deleteNode(ListNode node){
        /**这种情况下需要先把node的值先赋为node.next.val*/
        if(node==null) return;
        node.val = node.next.val;
        node.next = node.next.next;

        /**
         * 1->2->3->4 if we need to delete node 3
         * we can change node 3'val is equal to 4'val;
         * 1->2->4->4
         * then we move node.next to node.next.next
         * 所以就变成了 1->2->4;
         * */
    }
}
