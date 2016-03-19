package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hongruzh on 3/5/16.
 */
public class PermutationAmazon {
    public ArrayList<ArrayList<Integer>> permutation(int[] nums){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(nums==null||nums.length==0) return result;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        dfs(result,list,nums);
        return result;
    }

    public void dfs(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list,int[] nums){

        if(list.size()==nums.length){
            result.add(new ArrayList<Integer>(list));
        }
        /**
         * permutation里面
         * result.add(list) 出现的都是空集
         * result.add(new ArrayList<Integer>(list));
         */
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            dfs(result,list,nums);
            list.remove(list.size()-1);
        }
    }

}
