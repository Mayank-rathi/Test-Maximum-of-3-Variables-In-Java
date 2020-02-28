package com.maximumUsingGenerics;

import java.util.Collection;

public class MaximumProblemInGenerics<M extends Comparable<M>> {
    M first;
    M second;
    M third;

    public MaximumProblemInGenerics(M first, M second, M third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public M MaximumumnumberFinder(M first, M second, M third) {
        M maxNum = first;
        if (maxNum.compareTo(second) < 0)
            maxNum = second;
        if (maxNum.compareTo(third) < 0)
            maxNum = third;
        return maxNum;
    }

    public M MaximumumnumberFinder() {
        return MaximumumnumberFinder(first, second, third);
    }
}
