package 设计模式;

/**
 * @ClassName Singleton 懒汉式
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/10/11
 * @Version V1.0
 **/
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}
