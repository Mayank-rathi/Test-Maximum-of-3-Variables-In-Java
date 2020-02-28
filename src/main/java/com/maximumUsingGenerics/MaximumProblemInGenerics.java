package com.maximumUsingGenerics;

public class MaximumProblemInGenerics {
    public static Integer MaximumumnumberFinderInInteger(Integer first, Integer second, Integer third) {
        Integer maxNum = first;
        if (maxNum.compareTo(second) < 0)
            maxNum = second;
        if (maxNum.compareTo(third) < 0)
            maxNum = third;
        return maxNum;
    }

    public static Float MaximumumnumberFinderInFloat(Float first, Float second, Float third) {
        Float maxNum = first;
        if (maxNum.compareTo(second) < 0)
            maxNum = second;
        if (maxNum.compareTo(third) < 0)
            maxNum = third;
        return maxNum;
    }

    public static String MaximumumnumberFinderInString(String first, String second, String third) {
        String maxNum = first;
        if (maxNum.compareTo(second) < 0)
            maxNum = second;
        if (maxNum.compareTo(third) < 0)
            maxNum = third;
        return maxNum;
    }
}
