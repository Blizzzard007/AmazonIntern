package com.company;

/**
 * Created by hongruzh on 3/6/16.
 */
public class findMissingPositive {
    public int firstMissingPositive(int[] nums){
        int len = nums.length;

        for(int i=0;i<len;i++){
            if(nums[i]>0 && nums[i]<len&&nums[nums[i]-1]!=nums[i]){
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=tmp;
                i--;
            }
        }
        for(int i=0;i<len;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return len+1;
    }

}
