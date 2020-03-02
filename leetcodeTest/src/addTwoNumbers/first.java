package addTwoNumbers;

/**
 * @Author Jalen
 * @Date 2020/1/7 20:04
 * @Description 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *              输出：7 -> 0 -> 8
 *              原因：342 + 465 = 807
 **/
public class first {
    public static void main(String[] args) {
        ListNode l1=new ListNode(3);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(2);

        ListNode l2=new ListNode(4);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(5);

        ListNode sum=addTwoNumbers(l1, l2);
        while(sum!=null){
            System.out.println(sum.val);
            sum=sum.next;
        }
    }

    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head=new ListNode(0);
        ListNode p=l1,q=l2,cur=head;
        int carry=0;
        while(p!=null || q!=null){
            int x=(p!=null)?p.val:0;
            int y=(q!=null)?q.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
            if (p != null) {
                p=p.next;
            }
            if (q != null) {
                q=q.next;
            }
        }
        if (carry>0){
            cur.next=new ListNode(carry);
        }
        return head.next;
    }
}


