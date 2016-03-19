package com.company;

import java.util.ArrayList;

/**
 * Created by hongruzh on 2/27/16.
 * String s = abc
 */
public class Permutation {
    public ArrayList<String> permutation(String s){

        ArrayList<String> result = new ArrayList<String>();
        if(s==null||s.length()==0) return result;
        StringBuilder sb = new StringBuilder();
        dfs(result,sb,s);
        return result;
    }

    public void dfs(ArrayList<String> result,StringBuilder sb,String s){

        if(sb.toString().length()==s.length()){
            result.add(sb.toString());
        }
        /**if we have the string "abc" */
        /** time complexity is O(n!) becasue  we start from a we need traversal the whole string
         *  then we start from b we need traversal the whole string n
         *   第一个位置可以有 n个选法  第二个位置可以有 n-1 个选法  第三个位置可以有n-2个选法 一直到最后一个位置可以有 1个选法
         *   所以时间复杂度是 n*n-1*n-2*n-3*n-4*.....1
         *
         * */
        for(int i=0;i<s.length();i++){   /**  O(n) */

            char c = s.charAt(i);
            if(sb.toString().contains(c+"")){
               continue;
            }
            sb.append(c).toString();
            dfs(result,sb,s);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
