package com.maximumUsingGenerics;

import java.util.Collection;

public class MaximumProblemInGenerics {
    public <M extends Comparable<M>>M MaximumumnumberFinder(M first,M second,M third){
        M maxNum = first;
        if (maxNum.compareTo(second) < 0)
            maxNum = second;
        if (maxNum.compareTo(third) < 0)
            maxNum = third;
        return maxNum;
    }

}
