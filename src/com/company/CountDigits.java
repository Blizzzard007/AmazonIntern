package com.company;

/**
 * Created by hongruzh on 2/25/16.
 */
public class CountDigits {
    public int countDigit(int num){
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return (num % count);
    }
}
