package com.company;

/**
 * Created by hongruzh on 3/9/16.
 */
public class longestSubstring {
    public String longestPalindrome(String s) {
        int max = Integer.MIN_VALUE;
        String str1="";
        for(int i=0;i<s.length();i++){
            String str ="";

            for(int j=i+1;j<s.length();j++){
                if(j==s.length()-1){
                    str = s.substring(i,j)+s.charAt(j);
                }else {
                    str = s.substring(i, j);
                }
                if(isPalidrome(str)&&str.length()>max){
                    max = Math.max(max, str.length());
                    str1 =str;
                }
            }
        }
        return str1;
    }



    public boolean  isPalidrome(String s){
        if(s.length()==1) return true;
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

}
