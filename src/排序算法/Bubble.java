package 排序算法;

import java.util.ArrayList;

/**
 * @ClassName 排序算法.Bubble 冒泡排序
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class Bubble {
    public static void main(String[] args) {
        int[] array = {3, 6, 4, 8, 1, 3, 13, 11};
        long start = System.currentTimeMillis();
        bobble(array);
        long end = System.currentTimeMillis();
        System.out.println("时间"+(end - start));

    }

    public static int[] bobble(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
//        for (int i = 0; i < array.length; i++)
//            for (int j = 0; j < array.length - 1 - i; j++)
//                if (array[j + 1] < array[j]) {
//                    int temp = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = temp;
//                }
        for (int i : array) {
            System.out.println(i);
        }
        return array;
    }
}
