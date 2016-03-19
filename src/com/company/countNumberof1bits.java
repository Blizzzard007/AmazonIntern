package com.company;

/**
 * Created by hongruzh on 3/8/16.
 */

/**
 * for example we have number 10 it binary form is  1010  we can use 1 compare with this number
 *
 * */
public class countNumberof1bits {
    public int countNumberof1bits(int nums) {
        int count=0;
        System.out.println(5&7);
        for (int i = 0; i < 32; i++) {
              if((nums&(1<<i))!=0){
                  count++;
              }
        }
        return count;
    }
}
