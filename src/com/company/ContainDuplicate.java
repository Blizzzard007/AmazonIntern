package com.company;

import java.util.TreeSet;

/**
 * Created by hongruzh on 3/6/16.
 */
public class ContainDuplicate {


  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
   if(k < 1 || t < 0)
    return false;
   TreeSet<Integer> set = new TreeSet<Integer>();
   for(int i = 0; i < nums.length; i++){
    int n = nums[i];
    if(set.floor(n) != null && n <= t + set.floor(n) ||
            set.ceiling(n) != null && set.ceiling(n) <= t + n)
     return true;
    set.add(n);
    if (i >= k)
     set.remove(nums[i - k]);
   }
   return false;
  }
}



/**
 *
 *TreeSet
 *
 * Time Complexity O(nLgk)
 * Loop is O(n)
 * floor and ceiling is O(lgk)
 *
 import java.util.*;
 public class TreeSetDemo {
 public static void main(String args[]) {
 // Create a tree set
 TreeSet ts = new TreeSet();
 // Add elements to the tree set
 ts.add("C");
 ts.add("A");
 ts.add("B");
 ts.add("E");
 ts.add("F");
 ts.add("D");
 System.out.println(ts);
 }
 }
 This would produce the following result:
 [A, B, C, D, E, F]
 *
 *
 * */