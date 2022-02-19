import java.util.PriorityQueue;

public class SorttKLists {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>((a, b)->{
            return a.value-b.value;
        });
        ListNode dummy=new ListNode();
        ListNode prev=dummy;
        for(ListNode l:lists){
            if(l!=null){
                pq.add(l);
            }
        }
        while(pq.size()!=0){
            ListNode node=pq.remove();
            prev.next=node;
            prev=prev.next;
            node=node.next;
            if(node!=null){
                pq.add(node);
            }
        }
        return dummy.next;
    }
}
