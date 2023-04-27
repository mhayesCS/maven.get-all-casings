package com.github.curriculeon;

public class StringUtils {
    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        String ans = "";
        int cap =0;
        for(int x =0; x<string.length(); x++){
            if (cap < indices.length && x == indices[cap]){
                ans += string.toUpperCase().charAt(x);
                cap++;
            }
            else
                ans += string.charAt(x);
        }
        return ans;
    }


    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        String ans = "";
        for (int x = 0; x<stringToBeManipulated.length(); x++){
            if (x == index){
                ans+=valueToBeInserted;
            }
            ans += stringToBeManipulated.charAt(x);
        }
        return ans;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        return null;
    }
}
