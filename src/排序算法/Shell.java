package 排序算法;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName Shell 希尔排序
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/14
 * @Version V1.0
 **/
public class Shell {
    public static void shellSort(int[] arr) {
        int len = arr.length;
        int temp = 0;
        int gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                int j = i - gap;
                temp = arr[i];
                while (j >= 0 && arr[j] > temp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = temp;
            }
            gap /= 2;
        }

        //交换法
        // for (int gap = arr.length / 2; gap > 0; gap /= 2) {
        //     for (int i = gap; i < arr.length; i++) {
        //         for (int j = i - gap; j >= 0; j -= gap) {
        //             if (arr[j] < arr[j + gap]) {
        //                 temp = arr[j];
        //                 arr[j] = arr[j + gap];
        //                 arr[j + gap] = temp;
        //             }
        //         }
        //     }
        // }
    }
}
