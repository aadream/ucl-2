package com.yazi.ucl;

import java.util.*;

/**
 * @author yazi
 */
public class MainApp {
    static Team psg = new Team("巴黎", "A", "法甲");
    static Team bayern = new Team("拜仁", "B", "德甲");
    static Team manCity = new Team("曼城", "C", "英超");
    static Team juve = new Team("尤文", "D", "意甲");
    static Team liver = new Team("利物浦", "E", "英超");
    static Team barce = new Team("巴萨", "F", "西甲");
    static Team leipzig = new Team("莱比锡", "G", "德甲");
    static Team valen = new Team("瓦伦西亚", "H", "西甲");


    static Team real = new Team("皇马", "A", "西甲");
    static Team hotspur = new Team("热刺", "B", "英超");
    static Team ata = new Team("亚特兰大", "C", "意甲");
    static Team ath = new Team("马竞", "A", "西甲");
    static Team napoli = new Team("皇马", "A", "西甲");
    static Team dort = new Team("皇马", "A", "西甲");
    static Team lyon = new Team("皇马", "A", "西甲");
    static Team che = new Team("皇马", "A", "西甲");


    public static void main(String[] args) {

    }

    private void select() {
        Set<Team> set1 = new HashSet<>();
        set1.add(psg);
    }

    public static <E> E getRandom(Set<E> set) {
        int rn = getRandomInt(set.size());
        int i = 0;
    }

    private static int getRandomInt(int size) {


    }


    static class Team {
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Team team = (Team) o;
            return Objects.equals(name, team.name) &&
                    Objects.equals(group, team.group) &&
                    Objects.equals(league, team.league);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (group != null ? group.hashCode() : 0);
            result = 31 * result + (league != null ? league.hashCode() : 0);
            return result;
        }

        private String name;
        private String group;
        private String league;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getLeague() {
            return league;
        }

        public void setLeague(String league) {
            this.league = league;
        }

        public Team(String name, String group, String league) {
            this.name = name;
            this.group = group;
            this.league = league;
        }
    }
}

