package 排序算法;

/**
 * @ClassName 排序算法.Selection 选择排序
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/8/31
 * @Version V1.0
 **/
public class Selection {
    public static void main(String[] args) {
        int[] array = {9, 5, 6, 1, 4, 6, 8, 12};
        selection(array);

    }

    public static void selection(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            int minIndex = i;
//            for (int j = i; j < array.length; j++) {
//                if (array[j] < array[minIndex]) //找到最小的数
//                    minIndex = j; //将最小数的索引保存
//            }
//            int temp = array[minIndex];
//            array[minIndex] = array[i];
//            array[i] = temp;
//        }
        for (int i = 0; i < array.length; i++) {
            int max = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
        for (int i :
                array) {
            System.out.println(i);
        }
    }
}
