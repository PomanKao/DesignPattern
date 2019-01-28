package com.home.designpattern.designpatterns.Strategy;

import java.util.Comparator;

/**
 * 以村莊名稱做排序(ConcreteStrategy)
 */
public class SortVillageByName implements Comparator<Village> {
    @Override
    public int compare(Village o1, Village o2) {
        if (o1.name.charAt(0) > o2.name.charAt(0))
            return 1;
        if (o1.name.charAt(0) < o2.name.charAt(0))
            return -1;
        return 0;
    }
}
