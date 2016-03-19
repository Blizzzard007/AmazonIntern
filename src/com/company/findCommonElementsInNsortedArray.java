package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongruzh on 3/8/16.
 */
public class findCommonElementsInNsortedArray {
    public static Integer[] commonElementsInNSortedArrays(int[][] arrays) {
        int baseIndex = 0, currentIndex = 0, totalMatchFound = 0;
        int[] indices = new int[arrays.length - 1];
        boolean smallestArrayTraversed = false;
        List<Integer> result = new ArrayList<Integer>();
        while (!smallestArrayTraversed && baseIndex < arrays[0].length) {
            totalMatchFound = 0;
            for (int array = 1; array < arrays.length; array++) {
                currentIndex = indices[array - 1];
                while (currentIndex < arrays[array].length && arrays[array][currentIndex] < arrays[0][baseIndex]) {
                    currentIndex++;
                }

                if (currentIndex < arrays[array].length) {
                    if (arrays[array][currentIndex] == arrays[0][baseIndex]) {
                        totalMatchFound++;
                    }
                } else {
                    smallestArrayTraversed = true;
                }
                indices[array - 1] = currentIndex;
            }
            if (totalMatchFound == arrays.length - 1) {
                result.add(arrays[0][baseIndex]);
            }
            baseIndex++;
        }

        return result.toArray(new Integer[0]);
    }
}
