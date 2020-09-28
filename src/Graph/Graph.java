package Graph;

import java.util.ArrayList;

/**
 * @ClassName Graph 无向图
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/28
 * @Version V1.0
 **/
public class Graph {
    private ArrayList<String> vertexList; //存储顶点集合
    private int[][] edges; //存储图对应的邻结矩阵
    private int numOfEdges; //表示边的数量


    public Graph(int n) {
        vertexList = new ArrayList<>(n);
        edges = new int[n][n];
        numOfEdges = 0;
    }
}
