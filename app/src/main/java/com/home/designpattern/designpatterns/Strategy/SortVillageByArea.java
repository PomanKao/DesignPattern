package com.home.designpattern.designpatterns.Strategy;

import java.util.Comparator;

/**
 * 以村莊面積做排序(ConcreteStrategy)
 */
public class SortVillageByArea implements Comparator<Village> {
    @Override
    public int compare(Village o1, Village o2) {
        if (o1.area > o2.area)
            return 1;
        if (o1.area < o2.area)
            return -1;
        return 0;
    }
}
