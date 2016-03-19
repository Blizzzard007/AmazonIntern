package com.company;

/**
 * Created by hongruzh on 3/8/16.
 */
public class highestBit {
    public class HighestBitinByte {
        public int highestBit(int num) {
            for (int i = 1; i <= 7; i++) {
                num=num>>>1;
            }
            return num&1;
        }
    }

    //first thing I need to know is >>> means unsigned right shift.so o after
    // 7 time right shift. There will be 0000 000x left.
    // Num and 1 will be x (0 or 1)
}
