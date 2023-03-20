package com.github.curriculeon;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        String temp1 = string;
        for (Integer index : indices) {
            Character character = string.charAt(index);
            temp1 = replaceAtIndex(temp1, Character.toUpperCase(character), index);
        }
        return temp1;
    }


    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted - value to insert into string
     * @param index - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        return stringToBeManipulated.substring(0, index) + valueToBeInserted + stringToBeManipulated.substring(index);
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue - value to insert at `index`
     * @param index - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder sb = new StringBuilder(stringToBeManipulated);
        sb.setCharAt(index, replacementValue);
        return sb.toString();
    }
}
