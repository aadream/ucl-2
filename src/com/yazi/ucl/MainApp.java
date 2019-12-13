package com.yazi.ucl;

import java.util.*;

/**
 * @author yazi
 */
public class MainApp {
    static List<Team> list1;
    static List<Team> list2;
    static {
        list1.add(new Team("巴黎", "法甲", 0));
        list1.add(new Team("拜仁", "德甲", 0));
        list1.add(new Team("曼城", "英超", 0));
        list1.add(new Team("尤文", "意甲", 0));
        list1.add(new Team("利物浦", "英超", 0));
        list1.add(new Team("巴萨", "西甲", 0));
        list1.add(new Team("莱比锡", "德甲", 0));
        list1.add(new Team("瓦伦西亚", "西甲", 0));

        list2.add(new Team("皇马", "西甲", 0));
        list2.add(new Team("热刺", "英超", 0));
        list2.add(new Team("亚特兰大", "意甲", 0));
        list2.add(new Team("马竞", "西甲", 0));
        list2.add(new Team("那不勒斯", "意甲", 0));
        list2.add(new Team("多特蒙德", "德甲", 0));
        list2.add(new Team("里昂", "法甲", 0));
        list2.add(new Team("切尔西", "英超", 0));
    }

    static void solution() {
        ArrayList<Match> match = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            Team t2 = list2.get(i);
            for (int j = 0; j < list1.size(); j++) {

            }
        }
    }


    public static void main(String[] args) {

    }




}

