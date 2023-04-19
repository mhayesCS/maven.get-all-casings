package com.github.curriculeon;

public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of integers between `start` and `stop` incrementing by 1
     */
    public static Integer[] getRange(Integer start, Integer end) {
        Integer[] ans = new Integer[end-start+1];
        int index = 0;
        for (int x = start; x<=end; x++){
            ans[index] = x;
            index++;
        }
        return ans;

    }
}
