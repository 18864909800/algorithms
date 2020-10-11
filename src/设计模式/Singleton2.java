package 设计模式;

/**
 * @ClassName Singleton2 饿汉式
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/10/11
 * @Version V1.0
 **/
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
