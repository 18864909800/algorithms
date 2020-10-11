package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DFS 深度优先排序
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/29
 * @Version V1.0
 **/
public class DFS {
    private static List<Integer> list = new ArrayList<>();

    public static List<Integer> dfs(TreeNode root) {
        if (root == null) {
            return null;
        }

        list.add(root.val);
        if (root.left != null) {
            dfs(root.left);
        }
        if (root.right != null) {
            dfs(root.right);
        }
        return list;
    }



}
