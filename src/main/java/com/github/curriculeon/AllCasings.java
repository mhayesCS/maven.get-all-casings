package com.github.curriculeon;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AllCasings {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        int stringLength = string.length();
        Integer endingIndex = stringLength - 1;
        Integer startingIndex = 0;
        Integer[] allIndices = ArrayUtils.getRange(startingIndex, endingIndex);
        PowerSet<Integer> permutator = new PowerSet<>(allIndices);
        Set<String> list = new HashSet<>();
        Set<Set<Integer>> allPossibleIndexSets = permutator.permute();
        allPossibleIndexSets.forEach(indexSet -> {
            Integer[] indexSetAsArray = indexSet.toArray(new Integer[0]);
            String result = StringUtils.upperCaseIndices(string, indexSetAsArray);
            list.add(result);
        });
        return list;
    }
}
