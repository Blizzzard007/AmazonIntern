package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hongruzh on 3/9/16.
 */
public class KzigzagIterator implements Iterator<Integer> {

    List<Iterator<Integer>> itlist;
    int turns;

    public KzigzagIterator(List<Iterator<Integer>> list) {
        this.itlist = new LinkedList<Iterator<Integer>>();
        // 将非空迭代器加入列表
        for(Iterator<Integer> it : list){
            if(it.hasNext()){
                itlist.add(it);
            }
        }
        turns = 0;
    }

    public Integer next() {
        if(!hasNext()){
            return 0;
        }




        Integer res = 0;
        // 算出本次使用的迭代器的下标
        int pos = turns % itlist.size();
        Iterator<Integer> curr = itlist.get(pos);
        res = curr.next();
        // 如果这个迭代器用完，就将其从列表中移出
        if(!curr.hasNext()){
            itlist.remove(turns % itlist.size());
            // turns变量更新为上一个下标
            turns = pos - 1;
        }
        turns++;
        return res;
    }

    public boolean hasNext() {
        return itlist.size() > 0;
    }

}
