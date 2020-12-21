package LinkList;

/**
 * @ClassName ListNode
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/10/20
 * @Version V1.0
 **/
public class ListNode {
    int val;
    ListNode next;


    ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
