package com.wtw;

import LinkList.ListNode;
import LinkList.Solution;
import org.junit.jupiter.api.Test;
import tree.BFS;
import tree.DFS;
import tree.TreeNode;
import 排序算法.Merge;
import 查找算法.BinarySearch;
import 查找算法.InsertValueSearch;

import java.util.*;


/**
 * @ClassName Testj
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/20
 * @Version V1.0
 **/
public class Testj {
    @Test
    public void tt() {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(1);
        set.add(3);
        set.add(2);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        System.out.println(2 << 3);
        List<Integer> list = new ArrayList<>();
    }

    @Test
    public void alg() {
        int[] arr = {3, 5, 1, 2, 8, 6, 9, 7};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] arr3 = {{1, 2, 1}, {2, 3, 3}, {1, 3, 100}};
        String word = "word";
        String abbr = "w2d";
        // Merge.MergeSort(arr);
        //Merge.merge(0,arr.length-1);
        // QuickSort.quickSort(arr,0,arr.length-1);

        System.out.println(InsertValueSearch.insertValueSearch(arr2, 1, 0, arr2.length - 1));
        //System.out.print(Arrays.toString(arr));

        Vaild v = new Vaild();
        v.valid(word, abbr);
        // System.out.println(v.valid(word, abbr));

    }

    /**
     * 二叉树遍历
     */
    @Test
    public void test3() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode10 = new TreeNode(10);
        TreeNode treeNode11 = new TreeNode(11);
        TreeNode treeNode12 = new TreeNode(12);

        treeNode.left = treeNode2;
        treeNode.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode4.left = treeNode8;
        treeNode5.left = treeNode9;
        treeNode6.left = treeNode10;

        treeNode7.left = treeNode11;
        treeNode7.right = treeNode12;

        //List<Integer> result = BFS.BFSByQueue(treeNode);
        List<Integer> result = DFS.dfs(treeNode);
        List<Character> list = new ArrayList<>();
        // for (char j : list
        // ) {
        //     System.out.println(j + "----------");
        // }
        Iterator<Integer> iterator = result.iterator();
        // while (iterator.hasNext()) {
        //     System.out.print(iterator.next() + " ");
        // }
        for (int i : result
        ) {
            System.out.println(i);
        }

    }

    @Test
    public void test4() {
        System.out.printf("%d%d/n", 1, 2);
    }

    @Test
    public void test5() {
        char[] data = {'a', 'b', 'c'};
        int l = data.length;
        for (int i = 0; i < l / 2; i++) {
            char temp;
            temp = data[i];
            data[i] = data[l - i - 1];
            data[l - i - 1] = temp;
        }
        System.out.println(Arrays.toString(data));
    }

    @Test
    public void t() {
        int[] bills = {5, 5, 5, 10, 5, 5, 10, 20, 20, 20};
        System.out.println(lemonadeChange(bills));
    }

    @Test
    public boolean lemonadeChange(int[] bills) {
        int[] money = new int[2];
        int l = bills.length;
        for (int i = 0; i < l; i++) {
            if (bills[i] == 5) {
                money[0]++;
            } else if (bills[i] == 10) {
                if (money[0] == 0) {
                    return false;
                } else {
                    money[0]--;
                    money[1]++;
                }
            } else if (bills[i] == 20) {
                if (money[0] == 0) {
                    return false;
                } else if (money[1] != 0 & money[0] != 0) {
                    money[1]--;
                    money[0]--;
                } else if (money[1] == 0 & money[0] >= 3) {
                    money[0] -= 3;
                } else if (money[0] < 3 && money[1] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void test6() {
        String s = countAndSay(5);
        System.out.println(s);
    }

    public String countAndSay(int n) {
        String[] res = new String[n];
        res[0] = "1";
        for (int i = 1; i < n; i++) {
            int ch = 0;
            int count = 0;
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < res[i - 1].length(); j++) {
                if (res[i - 1].charAt(j) - '0' != ch) {
                    if (j != 0) {
                        sb.append(count + "" + ch);
                    }
                    ch = res[i - 1].charAt(j) - '0';
                    count = 1;
                } else {
                    count++;
                }
            }
            sb.append(count + "" + ch);
            res[i] = sb.toString();
        }
        return res[n - 1];
    }


    @Test
    public ArrayList<Integer> solve(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        if(matrix.length==0) return list;
        int x=matrix[0].length;
        int y=matrix.length;
        for (int i = 0; i <y ; i++) {
            if(i%2==0){
                for (int j = 0; j <x ; j++) {
                    list.add(matrix[j][i]);
                }
            }else {
                for (int j = x-1; j >=0 ; j--) {
                    list.add(matrix[j][i]);
                }
            }
        }
        return list;
    }

    public boolean Find(int target, int [][] array) {
        String s="2131231";
        char[] res=s.toCharArray();

        if (array==null) return false;
        int length=array[0].length;
        int high=array.length;
        int i=length-1;
        int j=0;
        while (i>=0&&j<high){
            if(target==array[j][i]) return true;
            if(target>array[j][i]) i--;
            if(target<array[j][i]) j++;
        }
        return false;
    }


}


