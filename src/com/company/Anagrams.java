package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by hongruzh on 2/28/16.
 */
public class Anagrams {
    public boolean testAnagrams(String s,String t){

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        if(s1.length!=t1.length) return false;

        Arrays.sort(s1);
        Arrays.sort(t1);

        String str1 = new String(s1);
        String str2 = new String(t1);

        if(str1.equals(str2)) return true;
        else {return false;}
    }
    /** Leetcode 49. Group Anagrams*/
    public ArrayList<ArrayList<String>> GroupAnagrams(String[] s){
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        for(int i=0;i<s.length;i++){
            char[] arr = s[i].toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            ArrayList<String> list = new ArrayList<String>();
            if(!map.containsKey(str)){
                list.add(s[i]);
                map.put(str,list);
            }else{
                map.get(str).add(s[i]);
            }

        }
        for(ArrayList<String> list: map.values()){
            Collections.sort(list);
            result.add(list);
        }
        return result;
    }
}
