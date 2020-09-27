package com.wtw;

import org.junit.jupiter.api.Test;
import 排序算法.Merge;
import 查找算法.BinarySearch;
import 查找算法.InsertValueSearch;

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
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Merge.MergeSort(arr);
        //Merge.merge(0,arr.length-1);
        // QuickSort.quickSort(arr,0,arr.length-1);

        System.out.println(InsertValueSearch.insertValueSearch(arr2,1,0,arr2.length-1));
        //System.out.print(Arrays.toString(arr));

    }


}
