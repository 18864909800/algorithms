package 二进制;

/**
 * @ClassName 一的个数
 * @Description: TODO
 * @Author 949210597
 * @Date 2021/3/4
 * @Version V1.0
 **/
public class 一的个数 {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
