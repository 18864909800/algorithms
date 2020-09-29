package com.wtw;

import java.util.*;

/**
 * @ClassName S
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/29
 * @Version V1.0
 **/
public class S {
    static int minPath(int n, int[][] edges, int start, int end) {
        Map<Integer, Map<Integer, Integer>> edgesMap = getEdgesMap(n, edges);
        int result = dfs(edgesMap, start, end);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    /**
     * 获得点到其它的距离集合
     * @param n 节点总数
     * @param edges 无向图的边
     * @return map 距离集合
     */
    private static Map<Integer, Map<Integer, Integer>> getEdgesMap(int n, int[][] edges) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>(2 * n);
        List<int[]> list = new ArrayList<>(n);
        Collections.addAll(list, edges);
        list.forEach(l -> {
            int start = l[0];
            int end = l[1];
            int distance = l[2];
            map.computeIfAbsent(start, k -> new HashMap<Integer, Integer>(n));
            map.get(start).merge(end, distance, (a, b) -> b < a ? b : a);
        });
        return map;
    }


    /**
     * 深度优先，获取所有可能的路径及惩罚
     *
     * @param edgesMap 利用map来储存各个点之间的距离
     * @param start    开始节点
     * @param end      结束节点
     * @return result 距离
     */
    private static int dfs(Map<Integer, Map<Integer, Integer>> edgesMap, int start, int end) {
        Map<Integer, Integer> startMap = edgesMap.get(start);
        int result = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> e : startMap.entrySet()) {
            int next = e.getKey();
            int path = e.getValue();
            if (next != end) {
                edgesMap.remove(start);
                path = path | dfs(edgesMap, next, end);
                edgesMap.put(start, startMap);
            }
            if (path < result) {
                result = path;
            }
        }
        return result;
    }
}
