package com.wtw;

import java.util.Arrays;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/10/29
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
    max(1,1,1);
        System.out.println(max(1,1,1));
    }
    public static int max(int a,int b,int c){
        int[] res=new int[5];
        res[0]=a+b+c;
        res[1]=(a+b)*c;
        res[2]=a*b*c;
        res[3]=a*(b+c);
        res[4]=b*(a+c);
        Arrays.sort(res);
        return  res[4];

    }
    }
