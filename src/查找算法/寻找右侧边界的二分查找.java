package 查找算法;

/**
 * @ClassName 寻找右侧边界的二分查找
 * @Description: TODO
 * @Author 949210597
 * @Date 2021/3/10
 * @Version V1.0
 **/
public class 寻找右侧边界的二分查找 {
    public static int right_bound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                left = mid + 1; // 注意
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        if (left == 0) return -1;
        return nums[left-1] == target ? (left-1) : -1;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2,2,4};
        int i = right_bound(nums, 5);
        System.out.println(i);
    }
}
