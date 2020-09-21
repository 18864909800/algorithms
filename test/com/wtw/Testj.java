package com.wtw;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
        int[] num = {1, 2, 3};
        List<List<Integer>> subsets = subsets(num);
        for (List<Integer> list : subsets
        ) {
            System.out.println(list);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        for (Integer num : nums) {
            for (int i = 0, j = lists.size(); i < j; i++) {
                List<Integer> list = new ArrayList<>(lists.get(i));
                list.add(num);
                lists.add(list);
            }

        }

        return lists;
    }
}
