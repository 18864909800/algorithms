package 排序算法;

import java.util.Arrays;

/**
 * @ClassName Counting 计数排序
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/11/15
 * @Version V1.0
 **/
public class Counting {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 1,10};


        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int[] count = new int[max - min + 1];
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]-min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            res[--count[arr[i]-min]] = arr[i];
        }
        return res;
    }
}
