package 查找算法;

/**
 * @ClassName BinarySearch 二分查找
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/27
 * @Version V1.0
 **/
public class BinarySearch {
    public static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = ((high - low) >> 1) + low;
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] < value) {
                low = mid + 1;
            }
            if (arr[mid] > value) {
                high = mid - 1;
            }
        }
        return -1;

    }
}
