package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName BFS 广度优先遍历
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/28
 * @Version V1.0
 **/
public class BFS {
    public static List<Integer> BFSByQueue(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //存放遍历结果，然后返回
        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();

            /*
            处理 TreeNode 节点 的逻辑
             */
            result.add(treeNode.val);


            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
        }
        return result;
    }

}
