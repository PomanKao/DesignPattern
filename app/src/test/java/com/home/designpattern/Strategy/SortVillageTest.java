package com.home.designpattern.Strategy;


import com.home.designpattern.designpatterns.Strategy.SortVillageByArea;
import com.home.designpattern.designpatterns.Strategy.SortVillageById;
import com.home.designpattern.designpatterns.Strategy.SortVillageByName;
import com.home.designpattern.designpatterns.Strategy.SortVillageByPopulation;
import com.home.designpattern.designpatterns.Strategy.Village;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 策略模式排序-測試
 */
public class SortVillageTest {

    @Test
    public void test() {
        System.out.println("==========策略模式排序測試==========");

        // 準備三個村莊的資料
        Village appleFarm = new Village(3,"apple farm",32,5.1);
        Village barnField = new Village(1,"barn field",22,1.7);
        Village capeValley = new Village(2, "cape valley",  10  ,10.2);

        ArrayList<Village> villages = new ArrayList<>();
        villages.add(appleFarm);
        villages.add(barnField);
        villages.add(capeValley);

        System.out.println("顯示未排序的資料");
        showList(villages);

        System.out.println("根據ID排序");
        Collections.sort(villages, new SortVillageById());
        showList(villages);

        System.out.println("根據名字排序");
        Collections.sort(villages, new SortVillageByName());
        showList(villages);

        System.out.println("根據人口排序");
        Collections.sort(villages, new SortVillageByPopulation());
        showList(villages);

        System.out.println("根據面積排序");
        Collections.sort(villages, new SortVillageByArea());
        showList(villages);

    }

    private void showList(ArrayList<Village> villages) {
        for (Village village : villages) {
            System.out.println(village);
        }
    }
}
