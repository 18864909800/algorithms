package 八皇后问题;

/**
 * @ClassName Queen
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/13
 * @Version V1.0
 **/
public class Queen {
    // 表示定义几个皇后
    int max = 8;
    int[] array = new int[max];
    static int count=0;
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        Queen queen = new Queen();
        queen.check(0);
        long end=System.currentTimeMillis();
        System.out.println(count+" "+(end-start));
    }

    private void check(int n) {
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;
            if (judge(n)) {
                check(n + 1);
            }
        }
    }

    /**
     * 判断第b个皇后是否与前面的冲突
     *
     * @param n 第n个皇后
     * @return 是 true
     */
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (array[n] == array[i] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
