package 迷宫问题;

/**
 * @ClassName Maze 迷宫回溯问题
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/13
 * @Version V1.0
 **/
public class Maze {
    public static void main(String[] args) {

        // 创建二维数组模拟迷宫
        int[][] map = new int[8][7];
        /*
         * 使用1表示墙
         * 将上下左右都设置为1
         * */
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        //  设置挡板
        map[3][1] = 1;
        map[3][2] = 1;
        // map[1][2] = 1;
        // map[2][2] = 1;

        // 输出地图
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
        setWay(map, 1, 1);
        // 输出地图
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + "   ");
            }
            System.out.println();
        }

    }

    /**
     * @param map 地图
     * @param i   开始位置
     * @param j   开始位置
     * @return 如果找到就返回true
     * 思路：
     * 如果小球可以到达map[6][5]位置说明可以找到
     * 约定：当map[i][j]为0表示没有走过，1表示墙，2表示该点已经走过并且可以走，3表示该点已经走过但是走不通
     * 在走迷宫时需要确定一个策略 下-》右-》上-》左，如果该点走不通再回溯
     */
    public static boolean setWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (setWay(map, i + 1, j)) {
                    return true;
                } else if (setWay(map, i, j + 1)) {
                    return true;
                } else if (setWay(map, i - 1, j)) {
                    return true;
                } else if (setWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

}
