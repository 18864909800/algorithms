package LinkList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/10/20
 * @Version V1.0
 **/
public class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> list=new ArrayList<ListNode>();
        Stack<ListNode> stack=new Stack<ListNode>();
        int i=0;
        while(head!=null){
            list.add(head);
            stack.push(head);
            i++;
            head=head.next;
        }
        int l=i/2;
        for(int j=0;j<l-1;j++){

            list.get(j).next=stack.peek();
            stack.pop().next=list.get(j+1);
            //stack.pop();
        }

    }
}
