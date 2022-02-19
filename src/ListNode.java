public class ListNode {
    ListNode next ;
    int value;

    ListNode(){}

    ListNode(int value){
        this.value = value;
    }

    ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }
}
