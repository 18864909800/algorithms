package 排序算法;

/**
 * @ClassName QuickSort 快速排序
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/25
 * @Version V1.0
 **/
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }

        temp = arr[low];
        i = low;
        j = high;
        while (i < j) {
            while (temp <= arr[j] && i < j) {
                j--;
            }
            while (temp >= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }
}
