package com.home.designpattern.designpatterns.Strategy;

import java.util.Comparator;

/**
 * 以ID做排序(ConcreteStrategy)
 */
public class SortVillageById implements Comparator<Village> {

    @Override
    public int compare(Village o1, Village o2) {
        if (o1.id > o2.id)
            return 1;
        if (o1.id < o2.id)
            return -1;
        return 0;
    }
}
