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
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res=res+(n&1);
            n>>>=1;
        }
        return res;
    }

}
