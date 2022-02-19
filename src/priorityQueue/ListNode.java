package priorityQueue;

public class ListNode {
    ListNode next ;
    ListNode prev;
    int value;

    ListNode(){}

    ListNode(int value){
        this.value = value;
    }

    ListNode(int value, ListNode next, ListNode prev){
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public void linkNeigh(){
        if(next != null)
        next.prev = this;

        if(prev!= null)
        prev.next = this;
    }
}
