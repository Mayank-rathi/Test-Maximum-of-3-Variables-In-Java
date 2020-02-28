package com.maximumUsingGenerics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaximumProblemInGenerics<M extends Comparable<M>> {
    M first;
    M second;
    M third;

    public MaximumProblemInGenerics(M first, M second, M third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public M MaximumumnumberFinder(M first, M second, M third, M... optional) {
        M maxNum = first;
        if (maxNum.compareTo(second) < 0)
            maxNum = second;
        if (maxNum.compareTo(third) < 0)
            maxNum = third;
        if (optional.length != 0) {
            Arrays.sort(optional, Collections.reverseOrder());
            if (maxNum.compareTo(optional[0]) < 0) {
                maxNum = optional[0];
            }
        }
        return maxNum;
    }

    public M MaximumumnumberFinder(M... optional) {
        return MaximumumnumberFinder(first, second, third, optional);
    }
}
