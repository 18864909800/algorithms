package 查找算法;

/**
 * @ClassName 寻找左侧边界的二分搜索
 * @Description: TODO
 * @Author 949210597
 * @Date 2021/3/10
 * @Version V1.0
 **/
public class 寻找左侧边界的二分搜索 {
    public static int left_bound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length; // 注意

        while (left < right) { // 注意
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid; // 注意
            }
        }
        if (left == nums.length) return -1;
        return nums[left] == target ? left : -1;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,2,4};
        int i = left_bound(nums, 2);
        System.out.println(i);
    }
}
