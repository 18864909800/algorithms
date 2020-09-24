package com.wtw;

import org.junit.jupiter.api.Test;
import 排序算法.Merge;
import 排序算法.Shell;

import java.util.*;

/**
 * @ClassName Testj
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/20
 * @Version V1.0
 **/
public class Testj {
    @Test
    public void tt() {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(1);
        set.add(3);
        set.add(2);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }

    @Test
    public void alg() {
        int[] arr = {3, 5, 1, 2, 8, 6, 9, 7};
        Merge.MergeSort(arr);
        System.out.print(Arrays.toString(arr));
    }




}
