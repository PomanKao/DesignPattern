package com.home.designpattern.designpatterns.Strategy;

import java.util.Comparator;

/**
 * 以人口做排序(ConcreteStrategy)
 */
public class SortVillageByPopulation implements Comparator<Village> {
    @Override
    public int compare(Village o1, Village o2) {
        if (o1.population > o2.population)
            return 1;
        if (o1.population < o2.population)
            return -1;
        return 0;
    }
}
