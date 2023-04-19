package com.github.curriculeon;

import java.util.Collection;

public class GenericUtils {
    /**
     * @param collection - collection to be converted to an array
     * @param <T>        - type of collection
     * @return array with contents identical to `collection`
     */
    public static <T> T[] toArray(Collection<T> collection) {
        T[] ans = (T[])new Object[collection.size()];
        for (int x = 0; x<collection.size(); x++){
            ans[x] = (T)collection.toArray()[x];
    }
        return ans;
    }
}
