package com.company;

/**
 * Created by hongruzh on 3/8/16.
 */
public class isPrime {
    public boolean isPrime(int num){
        if(num==2) return true;
        for(int n=2;n<num;n++){
            if(num%n==0){
                return false;
            }
        }
        return true;
    }
    public void previousNthprime(int num){
        for(int i=2;i<=num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
