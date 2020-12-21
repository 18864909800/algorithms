package Graph;

/**
 * @ClassName C
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/10/20
 * @Version V1.0
 **/
interface A{
    int x=0;
}
class B{
    int i=1;
    public void count(){
        System.out.println("Base method");
    }
    B(){
        count();
    }
}
public class C extends B  {
    int i=-1;

    public static void main(String[] args) {
        B b=new C();
        System.out.println(b.i);
        b.count();
    }
    public void count(){
        System.out.println("Des");
    }
}
