package 查找算法;

/**
 * @ClassName InsertValueSearch 插值查找
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/27
 * @Version V1.0
 **/
public class InsertValueSearch {
    public static int insertValueSearch(int[] arr, int value, int left, int right) {
        if (left > right || arr[left] > value || arr[right] < value) {
            return -1;
        }
        int mid = left + (right - left) * (value - arr[left]) / (arr[right] - arr[left]);
        int midVal = arr[mid];
        if (value > midVal) {
            return insertValueSearch(arr, value, mid + 1, right);
        } else if (value < midVal) {
            return insertValueSearch(arr, value, left, mid - 1);
        } else {
            return mid;
        }

    }
}
