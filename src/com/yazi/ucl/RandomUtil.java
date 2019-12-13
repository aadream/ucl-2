package com.yazi.ucl;

import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @author yazinnnn
 */
public class RandomUtil {
    private static Random random;

    public static Random getRandom() {
        if (random == null) {
            synchronized (Random.class) {
                if (random == null) {
                    random = new Random();
                }
            }
        }
        return random;
    }

    public static int getRandomInt(int max) {
        return Math.abs(getRandom().nextInt()) % max;
    }

    public static long getRandomLong(long max) {
        return Math.abs(getRandom().nextLong()) % max;
    }

    /**
     * 从list集合随机获取一个元素
     */

    public static <E> E getRandomElement(List<E> list) {
        return list.get(getRandomInt(list.size()));
    }

    /**
     * 从set集合中取出一个元素
     * @param set
     * @param <E>
     * @return
     */
    public static <E> E getRandomElement(Set<E> set) {
        int rn = getRandomInt(set.size());
        int i = 0;
        for (E e : set) {
            if (i == rn) {
                return e;
            }
            i++;
        }
        return null;
    }


}
