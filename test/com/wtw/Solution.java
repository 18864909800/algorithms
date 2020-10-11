package com.wtw;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/10/11
 * @Version V1.0
 * 判断s是不是t的子字符串
 **/
public class Solution {
    public static boolean isSubsequence (String s, String t) {
        // write code here
        int sl=s.length();
        int tl=t.length();
        if(sl==0) return true;
        if(sl!=0&&tl==0) return false;
        if(sl>tl) return false;

        boolean[] res=new boolean[sl];

        int m=0;
        for(int i=0;i<sl;i++){
            for(int j=m;j<tl;j++){
                if(s.charAt(i)==t.charAt(j)){
                    res[i]=true;
                    m=j+1;
                    break;
                }

            }

        }
        for(int i=0;i<sl;i++){
            if(res[i]==false){
                return false;
            }
        }
        return true;
    }
}
