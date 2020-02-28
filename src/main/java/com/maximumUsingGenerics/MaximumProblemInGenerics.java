package com.maximumUsingGenerics;

public class MaximumProblemInGenerics {
    public static Integer MaximumumnumberFinder(Integer first, Integer second, Integer third) {
        Integer maxNum = first;
        if (maxNum.compareTo( maxNum=second) > 0)
            maxNum=second;
        else if (maxNum.compareTo(maxNum=third) > 0)
            maxNum=third;
        return maxNum;
    }
}
