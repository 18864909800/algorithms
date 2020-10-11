package 排序算法;

import java.util.Arrays;

/**
 * @ClassName 排序算法.Insertion 插入排序
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/8/31
 * @Version V1.0
 **/
public class Insertion {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 1, 8, 12, 9};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 1; i <array.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if (array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        return array;
    }
}
