/**
 * @ClassName Insertion 插入排序
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/8/31
 * @Version V1.0
 **/
public class Insertion {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 1, 8, 12, 9};
        insertionSort(array);
    }

    public static int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }
}
